package com.Hotelmgmt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotelmgmt.Entities.Hotel;
import com.Hotelmgmt.Entities.Rating;
import com.Hotelmgmt.Entities.User;
import com.Hotelmgmt.Repository.HotelRepository;

@Service
public class HotelService
{
	
	@Autowired
	HotelRepository hotelrepository;
	public Hotel createHotel(Hotel hotel) 
	{
		return hotelrepository.save(hotel);
	}

	
	public List<Hotel> getAllHotel() {
		return hotelrepository.findAll();
	}

	public Hotel getHotel(Long hid)
	{
		return hotelrepository.findById(hid).get();
	}
	
	
	
	public Hotel updateHotel(Long hid,Hotel newhotel) 
	{
		Hotel h=hotelrepository.findById(hid).get();
	           h.setH_name(newhotel.getH_name());
				h.setH_add(newhotel.getH_add());
				h.setAmenities(newhotel.getAmenities());
                h.setContact_info(newhotel.getContact_info());
                h.setNo_of_rooms(newhotel.getNo_of_rooms());
                h.setRating(newhotel.getRating());
			
		return hotelrepository.save(h);
	}

	public String deleteHotel(Long hid) {
		hotelrepository.deleteById(hid);
		return "record deleted";
	}


	public List<Rating> getAllRatingByHotel(Long hid)
	{
		Hotel h=hotelrepository.findById(hid).get();
		return h.getR();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
