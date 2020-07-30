package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  whitelist
 * author name:  
 * create time: 2020-07-30 15:36:32
 */ 
public class Whitelist extends EntityHelper{

	private int listId;
	private int userId;
	private String adminNumber;

	public Whitelist() {
		super();
	}
	public Whitelist(int listId,int userId,String adminNumber) {
		this.listId=listId;
		this.userId=userId;
		this.adminNumber=adminNumber;
	}
	public void setListId(int listId){
		this.listId=listId;
	}
	public int getListId(){
		return listId;
	}
	public void setUserId(int userId){
		this.userId=userId;
	}
	public int getUserId(){
		return userId;
	}
	public void setAdminNumber(String adminNumber){
		this.adminNumber=adminNumber;
	}
	public String getAdminNumber(){
		return adminNumber;
	}
	@Override
	public String toString() {
		return "whitelist[" + 
			"listId=" + listId + 
			", userId=" + userId + 
			", adminNumber=" + adminNumber + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "listId";
	}
}

