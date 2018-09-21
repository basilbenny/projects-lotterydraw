package com.softup.lotterydraw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author BASIL
 * @version 0.1
 * @date 19-09-18
 *  
 *	User entity to store the user credentials and details
 *
 * */
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	private String password;
	
	private String name;
	private String phoneNumber;
	private String address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}
	
	
	
}
