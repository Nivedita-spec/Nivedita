package com.example.ChangeRequest.model;

import java.util.*;
import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="CR_USERS")
public class User {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="USER_ID", nullable = false, updatable= false)
	    private long userId;
	    @Column(name="USER_FM", nullable = false)
	    private String firstName;
	    @Column(name="USER_LM", nullable = false)
	    private String lastName;
//	    @Column(name="ROLE_TYP", nullable = false)
//	    private Set<RoleType> roleTyp = new HashSet<>();
	    @Column(name="EMAIL", nullable = false, unique = true)
	    private String email;
	    @Column(name="PHONE", nullable = false, unique = true)
	    private Integer phone;
	    @Column(name="INS_TS")
	    private Date  insertTimestamp ;
	    @Column(name="LU_TS")
	    private Date  lastUpdateTimestamp ;

	    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinTable(
	            name = "users_roles",
	            joinColumns = @JoinColumn(name = "user_id"),
	            inverseJoinColumns = @JoinColumn(name = "role_id")
	            )
	    private Set<RoleType> roles = new HashSet<>();

	    public User(){
	    	}

		public User(Integer userId, String firstName, String lastName, String email, Integer phone,
				Date insertTimestamp, Date lastUpdateTimestamp) {
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
			this.insertTimestamp = insertTimestamp;
			this.lastUpdateTimestamp = lastUpdateTimestamp;
			//this.roles = roles;
		}

		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getPhone() {
			return phone;
		}

		public void setPhone(Integer phone) {
			this.phone = phone;
		}

		public Date getInsertTimestamp() {
			return insertTimestamp;
		}

		public void setInsertTimestamp(Date currentDateTime) {
			this.insertTimestamp = currentDateTime;
		}

		public Date getLastUpdateTimestamp() {
			return lastUpdateTimestamp;
		}

		public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
			this.lastUpdateTimestamp = lastUpdateTimestamp;
		}

	
		public Set<RoleType> getRoles() {
			return roles;
		}

		public void setRoles(Set<RoleType> roles) {
			this.roles = roles;
		}

		@Override
		public String toString() {
			String userDetails = this.getUserId()+':'+this.getFirstName()+','
					+this.getLastName()+','+this.getEmail();
			return userDetails;
		}
		
}
