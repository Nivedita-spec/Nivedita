package com.example.ChangeRequest.service;

import java.util.*;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.ChangeRequest.repository.UserRepository;
import com.example.ChangeRequest.Convertor.UserConvertor;
import com.example.ChangeRequest.Convertor.UserRequestConvertor;
import com.example.ChangeRequest.model.*;


@Service
public class UserServiceImpl implements UserService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserRequestConvertor userRequestConvertor;
	@Autowired
	private UserConvertor userConvertor;

	public List<UserRequest> getAllUsers() {
		List<UserRequest> usersRequestLst = new ArrayList<>();
		List<User> userLst = (List<User>) userRepository.findAll();
		usersRequestLst = userLst.stream().map(User -> userConvertor.convert(User)).collect(Collectors.toList());
		return usersRequestLst;
	}

	public UserRequest getUserInfo(Integer userId) throws DataMissingException {
		if (userRepository.exists(userId)) {
			UserRequest UserReqData = userConvertor.convert(userRepository.findOne(userId));
			return UserReqData;
		}
		throw new DataMissingException("No User found with userId " + userId);
	}
	 @Transactional
	public User addUser(UserRequest userRequest) throws DataMissingException {
		User userData = userRequestConvertor.convert(userRequest);
		System.out.println("USER ROLES :" +userRequest.getUserRoles());
		return (User) userRepository.save(userData);
	}

	 public User updateUser(UserRequest userRequest) throws DataMissingException{
		 User userConvertData = userRequestConvertor.convert(userRequest);
		 User user = new User();
		 User userData = userRepository.findOne((int) user.getUserId());
	 if(userData!= null){
	// User updEntity = userRepository.findOne(userConvertData);
	 userData.setFirstName(userConvertData.getFirstName());
	 userData.setLastName(userConvertData.getLastName());
	 userData.setEmail(userConvertData.getEmail());
	 userData.setPhone(userConvertData.getPhone());
	 userData.setLastUpdateTimestamp(userConvertData.getLastUpdateTimestamp());
	 userData = userRepository.save(userData);
	
	 return userData;
	 } else {
		 userConvertData  = userRepository.save(userConvertData);
	
	 return userConvertData;
	 }
	 }

	public void deleteUser(Integer userId) throws DataMissingException {
		if (userRepository.exists(userId)) {
			userRepository.delete(userId);
		} else {
			throw new DataMissingException("Sorry no User found with userId " + userId);
		}
	}
}
