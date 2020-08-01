package com.example.ChangeRequest.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.ChangeRequest.model.User;
import com.example.ChangeRequest.model.UserRequest;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	User save(UserRequest userRequest);

	
}
