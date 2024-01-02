package com.Hotelmgmt.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotelmgmt.Entities.Rating;

public interface RatingRepository  extends JpaRepository<Rating, Long>
{
//	
//	  List<Rating> findAllByHotel(Long hId); 
//	  List<Rating> findAllByUserId(Long user);
//	 

}
