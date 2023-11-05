package com.simplilearn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.spring.jpa.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	
	// https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html use this documentation for especial methods 
	
	//ID_USER!=? AND UPPER(USERNAME) = UPPER(?) -> we turned this especial sql statement into a method
	
	public User findByIdUserNotAndUsernameIgnoreCase(int idUser, String username);

}
