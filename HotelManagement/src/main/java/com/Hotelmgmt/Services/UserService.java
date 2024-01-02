package com.Hotelmgmt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Hotelmgmt.Entities.User;
import com.Hotelmgmt.Repository.UserRepository;

@Service
public class UserService
{
	@Autowired
	UserRepository userrepository;

	public User createUser(User user) {
		return userrepository.save(user);
	}

	public List<User> getAllUser() {
		return userrepository.findAll();
	}

	public User getUser(Long uid)
	{
		return userrepository.findById(uid).get();
	}

	public User updateUser(Long id,User newuser) 
	{
		User u=userrepository.findById(id).get();
		
			
				u.setUsername(newuser.getUsername());
				u.setAddress(newuser.getAddress());
				u.setEmail(newuser.getEmail());
                u.setMobile(newuser.getMobile());
                u.setRole(newuser.getRole());
			
		return userrepository.save(u);
	}

	public String deleteUser(Long uid) {
		userrepository.deleteById(uid);
		return "record deleted";
	}
	
	
	

}
