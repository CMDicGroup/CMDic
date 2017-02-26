package com.cmd.db.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AgeCollection")
public class AgeRecord extends BaseCollectionRecord{

	private String ageName = null;
	
	public String getAgeName(){
		return ageName;
	}
	
	public void setAgeName(String value){
		ageName = value;
	}
	
}
