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
public class Hotel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long h_id;
	private String h_name;
	private String h_add;
	private Long contact_info;
	private int no_of_rooms;
	private String amenities;
	private int rating;
	@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
	private List<Rating> r=new ArrayList<>();
	
	
	
	public List<Rating> getR() {
		return r;
	}
	public void setR(List<Rating> r) {
		this.r = r;
	}
	public Long getH_id() {
		return h_id;
	}
	public void setH_id(Long h_id) {
		this.h_id = h_id;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public String getH_add() {
		return h_add;
	}
	public void setH_add(String h_add) {
		this.h_add = h_add;
	}
	public Long getContact_info() {
		return contact_info;
	}
	public void setContact_info(Long contact_info) {
		this.contact_info = contact_info;
	}
	public int getNo_of_rooms() {
		return no_of_rooms;
	}
	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Hotel(Long h_id, String h_name, String h_add, Long contact_info, int no_of_rooms, String amenities,
			int rating, List<Rating> r) {
		super();
		this.h_id = h_id;
		this.h_name = h_name;
		this.h_add = h_add;
		this.contact_info = contact_info;
		this.no_of_rooms = no_of_rooms;
		this.amenities = amenities;
		this.rating = rating;
		this.r = r;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
