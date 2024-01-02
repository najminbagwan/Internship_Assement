package com.Hotelmgmt.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Rating 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long rid;
	@ManyToOne()
	@JoinColumn(name="uid")
	private User user;
	@ManyToOne()
	@JoinColumn(name="hid")
	private Hotel hotel;
	
	private int r_value;
	private String comments;
	@Temporal(TemporalType.DATE)
	private Date date_of_rating;
	
	
	
	
	
	
	
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	
	public int getR_value() {
		return r_value;
	}
	public void setR_value(int r_value) {
		this.r_value = r_value;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDate_of_rating() {
		return date_of_rating;
	}
	public void setDate_of_rating(Date date_of_rating) {
		this.date_of_rating = date_of_rating;
	}
	public Rating(Long rid, User user, Hotel hotel, int r_value, String comments, Date date_of_rating) {
		super();
		this.rid = rid;
		this.user = user;
		this.hotel = hotel;
		this.r_value = r_value;
		this.comments = comments;
		this.date_of_rating = date_of_rating;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	

}
