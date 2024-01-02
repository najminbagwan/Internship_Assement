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

import com.Hotelmgmt.Entities.User;
import com.Hotelmgmt.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController 
{
   @Autowired
   UserService userservice;
   @PostMapping("/saveUser")
   public User createUser(@RequestBody User user)
   {
	 return  userservice.createUser(user);
   }
   
   @GetMapping("/getAllUsers")
   public List<User> getAllUser()
   {
	   return userservice.getAllUser();
   }
   
   @GetMapping("/getUser/{uid}")
   public User getUser(@PathVariable Long uid)
   {
	   return userservice.getUser(uid);
   }
   
   @PutMapping("/updateUser/{uid}")
   public User updateUser(@PathVariable Long uid,@RequestBody User user)
   {
	   return userservice.updateUser(uid,user);
   }
   
   @DeleteMapping("/delete/{uid}")
   public String deleteUser(@PathVariable Long uid)
   {
	   return userservice.deleteUser(uid);
   }
   
   
   
   
   
   
   
}
