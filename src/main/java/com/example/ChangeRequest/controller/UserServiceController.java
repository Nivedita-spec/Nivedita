package com.example.ChangeRequest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.slf4j.*;
import com.example.ChangeRequest.model.*;
import com.example.ChangeRequest.service.UserService;
import io.swagger.annotations.ApiOperation;

@RestController
public class UserServiceController {
		private final Logger log = LoggerFactory.getLogger(this.getClass());

		@Autowired
		private UserService userService;

		@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/users")
		public List<UserRequest> getAllUsers() throws DataMissingException {
			List<UserRequest> usrReqLst = userService.getAllUsers();
			return usrReqLst;
		}
		
		@ApiOperation(value = "get User by userId")
		@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/users/getUser")
		public UserRequest getUser(final @RequestBody Integer userRequestId) throws DataMissingException{
			UserRequest userRequest = userService.getUserInfo(userRequestId);
			return 	userRequest;
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@ApiOperation(value = "Add a User")
		@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/users/addUser")
		public ResponseEntity addUser(@RequestBody UserRequest userRequest ) throws DataMissingException {
			log.info("adding User details in the database : " + userRequest.toString());
			userService.addUser(userRequest);
			return new ResponseEntity("User added successfully", HttpStatus.OK);
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@ApiOperation(value = "Update a User")
		@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/users/updateUser")
		public ResponseEntity updateUser(@RequestBody UserRequest userRequest ) throws DataMissingException {
			log.info("updating User details in the database : " + userRequest.toString());
			userService.updateUser(userRequest);
			return new ResponseEntity("User update successfully", HttpStatus.OK);
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@ApiOperation(value = "Delete User by userId")
		@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/users/deleteUser")
		public void deleteUser(@RequestBody Integer userId) throws DataMissingException{
			userService.deleteUser(userId);
		}

}
