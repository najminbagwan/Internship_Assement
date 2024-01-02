package com.Hotelmgmt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotelmgmt.Entities.Rating;
import com.Hotelmgmt.Repository.HotelRepository;
import com.Hotelmgmt.Repository.RatingRepository;

@Service
public class RatingService
{
	
	@Autowired
	RatingRepository ratingrepository;
	@Autowired
	HotelRepository hotelRepository;

	public Rating createRating(Rating rating) {
		return ratingrepository.save(rating);
	}

	public List<Rating> getRatings() {
		return ratingrepository.findAll();
	}

	public Rating getRating(Long rid) {
		return ratingrepository.findById(rid).get();
	}

	public Rating updateRating(Rating newrating, Long id) {
		Rating rating=ratingrepository.findById(id).get();
		
		rating.setUser(newrating.getUser());
		rating.setHotel(newrating.getHotel());
		rating.setR_value(newrating.getR_value());
		rating.setComments(newrating.getComments());
		rating.setDate_of_rating(newrating.getDate_of_rating());
		
		
		return ratingrepository.save(rating);
		
	}
	public String deleteRating(Long rid) 
	{
		ratingrepository.deleteById(rid);
		return "record deleted";
	}

	
//	  public List<Rating> getAllRatingsByHotel(Long hid) 
//	  { 
//		  Rating r=ratingrepository.findById(hid).get();
//		  List<Rating> rating=ratingrepository.findAllByHotel(hid); 
//		  return rating;
//	  }
//	  
//	  
//	  
//	  public List<Rating> getAllRatingsByUser(Long uid)
//	  {
//		  List<Rating> rating=ratingrepository.findAllByUserId(uid); return rating;
//	
//	  }
	
}


