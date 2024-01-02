package com.Hotelmgmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotelmgmt.Entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
