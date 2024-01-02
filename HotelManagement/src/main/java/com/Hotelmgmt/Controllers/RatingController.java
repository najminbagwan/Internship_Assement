package com.Hotelmgmt.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hotelmgmt.Entities.Rating;
import com.Hotelmgmt.Services.RatingService;

@RestController
public class RatingController {
	@Autowired
	RatingService ratingservice;

	@PostMapping("/rating")
	public Rating createRating(@RequestBody Rating rating) {
		return ratingservice.createRating(rating);
	}

	@GetMapping("/getAllRatings")
	public List<Rating> getRatings() {
		return ratingservice.getRatings();

	}

	@GetMapping("/getRating/{rid}")
	public Rating getRating(@PathVariable Long rid) {
		return ratingservice.getRating(rid);
	}

	@PutMapping("/updateRating/{rid}")
	public Rating updateRating(@RequestBody Rating rating, @PathVariable Long id) {
		return ratingservice.updateRating(rating, id);
	}

	@DeleteMapping("/deleteRating/{rid}")
	public String deleteRating(@PathVariable Long rid) {
		return ratingservice.deleteRating(rid);
	}

	
//	  @GetMapping("/hotel/{hid}") public List<Rating>
//	  getAllRatingsByHotel(@PathVariable Long hid) { return
//	  ratingservice.getAllRatingsByHotel(hid); }
//	  
//	  @GetMapping("/h/{uid}") public List<Rating> getAllRatingsByUser(@PathVariable
//	  Long uid) { return ratingservice.getAllRatingsByHotel(uid); }
	

}
