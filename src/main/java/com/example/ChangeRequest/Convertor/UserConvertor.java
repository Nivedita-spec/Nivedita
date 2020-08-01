package com.example.ChangeRequest.Convertor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.example.ChangeRequest.model.*;


@Component
public class UserConvertor implements Converter<User, UserRequest> {
	
		@SuppressWarnings("unchecked")
	 public UserRequest convert(User user) {
		UserRequest userRequest = new UserRequest();
		long insertMillsec = user.getLastUpdateTimestamp().getTime();
		long updateMillsec = user.getLastUpdateTimestamp().getTime();
		Instant insertDate = Instant.ofEpochMilli(insertMillsec); 
		Instant updateDate = Instant.ofEpochMilli(updateMillsec); ; 
		Set<String> roles = (Set<String>) user.getRoles().stream().map(RoleType -> RoleType.getRoleId()).collect(Collectors.toSet());
		System.out.println("ROLESS :"+roles.toString());
		userRequest.setUserFirstName(user.getFirstName());
		userRequest.setUserLastName(user.getLastName());
		userRequest.setUserPhone(user.getPhone());
		userRequest.setUserEmail(user.getEmail());
		userRequest.setUserPhone(user.getPhone());
	    userRequest.setUserRoles((Set<String>)roles);
		userRequest.setUserInsertTimestamp(Date.from(insertDate));
		userRequest.setUserLastUpdateTimestamp(Date.from(updateDate));
		return userRequest;
	}

}
