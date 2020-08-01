package com.example.ChangeRequest.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "ROLE_TYP")
public class RoleType {

	@Id
	@Column(name = "ROLE_TYP_CD")
	private String roleId;
	@Column(name = "DESCR")
	private String description;
	@Column(name = "READ_SW")
	private String readSW;
	@Column(name = "WRITE_SW")
	private String writeSW;
	@Column(name = "APRV_SW")
	private String aprvSW;
	@Column(name = "INS_TS")
	private Date insertTimestamp;
	@Column(name = "LU_TS", nullable = true)
	private Date lastUpdateTimestamp;
	
	public RoleType(){
		
	}

	public RoleType(String roleId, String description, String readSW, String writeSW, String aprvSW,
			Date insertTimestamp, Date lastUpdateTimestamp) {
		this.roleId = roleId;
		this.description = description;
		this.readSW = readSW;
		this.writeSW = writeSW;
		this.aprvSW = aprvSW;
		this.insertTimestamp = insertTimestamp;
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReadSW() {
		return readSW;
	}

	public void setReadSW(String readSW) {
		this.readSW = readSW;
	}

	public String getWriteSW() {
		return writeSW;
	}

	public void setWriteSW(String writeSW) {
		this.writeSW = writeSW;
	}

	public String getAprvSW() {
		return aprvSW;
	}

	public void setAprvSW(String aprvSW) {
		this.aprvSW = aprvSW;
	}

	public Date getInsertTimestamp() {
		return insertTimestamp;
	}

	public void setInsertTimestamp(Date insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}

	public Date getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
	}

	public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

}
