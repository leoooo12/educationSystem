package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  test_center_information
 * author name:  
 * create time: 2020-07-30 15:36:32
 */ 
public class TestCenterInformation extends EntityHelper{

	private int roomId;
	private String roomName;
	private String roomAddress;
	private int roomNumber;
	private int numberStart;
	private int numberEnd;

	public TestCenterInformation() {
		super();
	}
	public TestCenterInformation(int roomId,String roomName,String roomAddress,int roomNumber,int numberStart,int numberEnd) {
		this.roomId=roomId;
		this.roomName=roomName;
		this.roomAddress=roomAddress;
		this.roomNumber=roomNumber;
		this.numberStart=numberStart;
		this.numberEnd=numberEnd;
	}
	public void setRoomId(int roomId){
		this.roomId=roomId;
	}
	public int getRoomId(){
		return roomId;
	}
	public void setRoomName(String roomName){
		this.roomName=roomName;
	}
	public String getRoomName(){
		return roomName;
	}
	public void setRoomAddress(String roomAddress){
		this.roomAddress=roomAddress;
	}
	public String getRoomAddress(){
		return roomAddress;
	}
	public void setRoomNumber(int roomNumber){
		this.roomNumber=roomNumber;
	}
	public int getRoomNumber(){
		return roomNumber;
	}
	public void setNumberStart(int numberStart){
		this.numberStart=numberStart;
	}
	public int getNumberStart(){
		return numberStart;
	}
	public void setNumberEnd(int numberEnd){
		this.numberEnd=numberEnd;
	}
	public int getNumberEnd(){
		return numberEnd;
	}
	@Override
	public String toString() {
		return "test_center_information[" + 
			"roomId=" + roomId + 
			", roomName=" + roomName + 
			", roomAddress=" + roomAddress + 
			", roomNumber=" + roomNumber + 
			", numberStart=" + numberStart + 
			", numberEnd=" + numberEnd + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "roomId";
	}
}

