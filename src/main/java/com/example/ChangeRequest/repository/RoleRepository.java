package com.example.ChangeRequest.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeRequest.model.*;

@Repository
public interface RoleRepository extends JpaRepository<RoleType, String>{
	 

	Set<RoleType> findByRoleId(Set<String> RoleType);
	//Set<String> findByuserRoleId(Set<RoleType> RoleType);

}
