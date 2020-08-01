package com.example.ChangeRequest.service;

import java.util.*;
import com.example.ChangeRequest.model.*;

public interface  UserService {
	public List<UserRequest> getAllUsers() throws DataMissingException;
	public User addUser(UserRequest userRequest)throws DataMissingException;
	public User updateUser(UserRequest userRequest)throws DataMissingException;
	public UserRequest getUserInfo(Integer userId) throws DataMissingException;
	public void deleteUser(Integer userId) throws DataMissingException;
	}


