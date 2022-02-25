package com.training.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.config.MyConfiguration;
import com.training.model.OrderedBook;

@FeignClient(name="book-service",url = "http://localhost:8082")
public interface BookProviderProxy 
{
  	
	@GetMapping("/bookstore/getbookupdated/isbn/{isbn}")
	public OrderedBook getOrderedBook(@PathVariable("isbn") String isbn);
	
}
