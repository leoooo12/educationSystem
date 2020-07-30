package com.demo.entity.exam;

/**
 * table name:  exam_room_information_school
 * author name:  
 * create time: 2020-07-30 15:36:31
 */ 
public class ExamRoomInformationSchool extends EntityHelper{

	private int examRoomId;
	private int examRoomNum;
	private String examRoomLocate;
	private int roomId;
	private int useStatus;

	public ExamRoomInformationSchool() {
		super();
	}
	public ExamRoomInformationSchool(int examRoomId,int examRoomNum,String examRoomLocate,int roomId,int useStatus) {
		this.examRoomId=examRoomId;
		this.examRoomNum=examRoomNum;
		this.examRoomLocate=examRoomLocate;
		this.roomId=roomId;
		this.useStatus=useStatus;
	}
	public void setExamRoomId(int examRoomId){
		this.examRoomId=examRoomId;
	}
	public int getExamRoomId(){
		return examRoomId;
	}
	public void setExamRoomNum(int examRoomNum){
		this.examRoomNum=examRoomNum;
	}
	public int getExamRoomNum(){
		return examRoomNum;
	}
	public void setExamRoomLocate(String examRoomLocate){
		this.examRoomLocate=examRoomLocate;
	}
	public String getExamRoomLocate(){
		return examRoomLocate;
	}
	public void setRoomId(int roomId){
		this.roomId=roomId;
	}
	public int getRoomId(){
		return roomId;
	}
	public void setUseStatus(int useStatus){
		this.useStatus=useStatus;
	}
	public int getUseStatus(){
		return useStatus;
	}
	@Override
	public String toString() {
		return "exam_room_information_school[" + 
			"examRoomId=" + examRoomId + 
			", examRoomNum=" + examRoomNum + 
			", examRoomLocate=" + examRoomLocate + 
			", roomId=" + roomId + 
			", useStatus=" + useStatus + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "examRoomId";
	}
}

