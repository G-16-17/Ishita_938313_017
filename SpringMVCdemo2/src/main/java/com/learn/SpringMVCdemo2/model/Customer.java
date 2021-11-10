package com.learn.SpringMVCdemo2.model;

import java.util.Date;

//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
//import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


public class Customer {
	
	private int customerId;
	
	@NotEmpty   //length>0
	private String firstName;
	
	@NotBlank  //trim the values and length of value>0
	private String lastName;
	
	@NotBlank(message = "UserName is Mandatory")
	private String userName;
	
	@NotBlank(message = "Password cannot be blank")
	private String password;
	
	@NotBlank(message = "Mandatory Field")
	private String confirmPassword;
	
	@NotBlank(message = "Email is Mandatory")
	private String emailId;
	
	@NotBlank
	private String gender;
	
	@NotNull
	@Past
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	
	@NotBlank
	private String country;
	
	//@Min(value=18, message = "Age cannot be less than 18.")
	//@Max(value = 100, message="Enter a valid age")
	//@Size(min=1, max=100, message = "Enter a valid number")
	//private int age;
	
	public Customer() {
		
	}
	
	

	public Customer(int customerId, @NotNull String firstName, @NotBlank String lastName,
			@NotBlank(message = "UserName is Mandatory") String userName,
			@NotBlank(message = "Password cannot be blank") String password,
			@NotBlank(message = "Mandatory Field") String confirmPassword,
			@NotBlank(message = "Email is Mandatory") String emailId, @NotBlank String gender,
			@NotNull @Past Date dateOfBirth, @NotBlank String country) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.emailId = emailId;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.country = country;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
