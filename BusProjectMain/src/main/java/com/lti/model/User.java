package com.lti.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
	@Id
	@Column(name="registered_email")
	private String registeredEmail;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="phone")
	private String phoneNumber;
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="DOB")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date dateOfBirth;
}
