package com.example.ChangeRequest.Convertor;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.example.ChangeRequest.model.*;
import com.example.ChangeRequest.repository.RoleRepository;

@Component
public class UserRequestConvertor implements Converter<UserRequest, User> {
	 @Autowired
	   private RoleRepository roleRepository;    
	
	@Override
	public User convert(UserRequest userRequest) {
		User user = new User();
		Set<RoleType> roles =  roleRepository.findByRoleId(userRequest.getUserRoles());
		System.out.println(roles);
		user.setFirstName(userRequest.getUserFirstName());
		user.setLastName(userRequest.getUserLastName());
		user.setEmail(userRequest.getUserEmail());
		user.setPhone(userRequest.getUserPhone());
		user.setRoles((Set<RoleType>) roles);
		user.setInsertTimestamp(new Date());
		user.setLastUpdateTimestamp(new Date());
		return user;
	}
}
