package com.Hotelmgmt.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long userid;
private String username;
private String email;
private Long mobile;
private String address;
private String role;

@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
private List<Rating> r=new ArrayList<>();


public Long getUserid() {
	return userid;
}
public void setUserid(Long userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

public List<Rating> getR() {
	return r;
}
public void setR(List<Rating> r) {
	this.r = r;
}
public User(Long userid, String username, String email, Long mobile, String address, String role, List<Rating> r) {
	super();
	this.userid = userid;
	this.username = username;
	this.email = email;
	this.mobile = mobile;
	this.address = address;
	this.role = role;
	this.r = r;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

	

}
