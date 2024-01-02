package com.Hotelmgmt.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotelmgmt.Entities.Hotel;
import com.Hotelmgmt.Entities.Rating;
import com.Hotelmgmt.Entities.User;
import com.Hotelmgmt.Services.HotelService;

import jakarta.persistence.Entity;

@RestController
@RequestMapping("/hotel")
public class HotelController 
{
	
	@Autowired
	HotelService hotelservice;
	
	
	@PostMapping("/saveHotel")
	   public Hotel createHotel(@RequestBody Hotel hotel)
	   {
		 return  hotelservice.createHotel(hotel);
	   }
	
	@GetMapping("/getAllHotels")
	   public List<Hotel> getAllHotel()
	   {
		   return hotelservice.getAllHotel();
	   }
	
	
	@GetMapping("/getHotel/{hid}")
	   public Hotel getHotel(@PathVariable Long hid)
	   {
		   return hotelservice.getHotel(hid);
	   }

	
	
	 @PutMapping("/updateHotel/{hid}")
	   public Hotel updateHotel(@PathVariable Long hid,@RequestBody Hotel hotel)
	   {
		   return hotelservice.updateHotel(hid,hotel);
	   }
	   
	   @DeleteMapping("/deleteHotel/{hid}")
	   public String deleteHotel(@PathVariable Long hid)
	   {
		   return hotelservice.deleteHotel(hid);
	   }
	   
	
	   
	   @GetMapping("/{hid}/ratings")
	   public List<Rating> getRatingsByHotel(@PathVariable Long hid)
	   {
		   return hotelservice.getAllRatingByHotel(hid);
	   }
	
	
	
	
	
	
	
}
