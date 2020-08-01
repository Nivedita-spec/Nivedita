package com.example.ChangeRequest.model;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class UserRequest {
	  private String userFirstName;
	  private String userLastName;
	  private String userEmail;
	  private Integer userPhone;
	  private Set<String> userRoles;
	  private Date  userInsertTimestamp;
	  private Date  userLastUpdateTimestamp;
	  
	public UserRequest(String userFirstName, String userLastName, String userEmail, Integer userPhone,Set<String> userRoles,
			Date userInsertTimestamp, Date userLastUpdateTimestamp) {
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userRoles = userRoles;
		this.userInsertTimestamp = userInsertTimestamp;
		this.userLastUpdateTimestamp = userLastUpdateTimestamp;
	}

	public UserRequest(){
	}
	
	public Set<String> getUserRoles() {
			return userRoles;
	}

		public void setUserRoles(Set<String> userRoles) {
			this.userRoles = userRoles;
		}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(Integer userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public String toString() {
		return "UserRequest [userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userEmail="
				+ userEmail + ", userPhone=" + userPhone + ", useRoles=" + userRoles + ", userInsertTimestamp="
				+ userInsertTimestamp + ", userLastUpdateTimestamp=" + userLastUpdateTimestamp + "]";
	}
	public Date getUserInsertTimestamp() {
		return userInsertTimestamp;
	}
	public void setUserInsertTimestamp(Date userInsertTimestamp) {
		this.userInsertTimestamp = userInsertTimestamp;
	}
	public Date getUserLastUpdateTimestamp() {
		return userLastUpdateTimestamp;
	}
	public void setUserLastUpdateTimestamp(Date userLastUpdateTimestamp) {
		this.userLastUpdateTimestamp = userLastUpdateTimestamp;
	}
	

}
