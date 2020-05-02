package com.me.example.KalMeds.dto;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Component("user")
@Table(name = "user_details")
@Data
public class User {
	//creating the user entity.
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long Id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String address;
	private String role;
	private String contactNo;
	
	//orderslist to be maintained
	

}
