package com.training.bean;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Entity
public class Notification {

	@Id
	@GeneratedValue
	private long id;
	
	//@Column(name = "email",nullable = false)
	private String email;
	private String message;
	
}
