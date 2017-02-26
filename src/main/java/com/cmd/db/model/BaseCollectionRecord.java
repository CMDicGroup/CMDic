package com.cmd.db.model;

import java.util.Date;

public class BaseCollectionRecord {

	private Boolean isActive = false;
	private String CreatedBy = null;
	private Date CreatedTime = null;
	private String UpdatedBy = null;
	private Date UpdatedTime = null;
	
	//get methods
	public Boolean getIsActive(){
		return isActive;
	}
	
	public String getCreatedBy(){
		return CreatedBy;
	}
	
	public Date getCreatedTime(){
		return CreatedTime;
	}
	
	public String getUpdatedBy(){
		return UpdatedBy;
	}
	
	public Date getUPdatedTime(){
		return UpdatedTime;
	}
	//Set methods
	public void setIsActive(Boolean value){
		isActive = value;
	}
	
	public void getCreatedBy(String value){
		 CreatedBy = value;
	}
	
	public void getCreatedTime(Date value){
		value = CreatedTime;
	}
	
	public void getUpdatedBy(String value ){
		UpdatedBy = value;
	}
	
	public void getUPdatedTime(Date value){
		UpdatedTime = value;
	}
	
	
}
