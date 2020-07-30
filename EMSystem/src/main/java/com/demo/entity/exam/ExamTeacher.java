package com.demo.entity.exam;

/**
 * table name:  exam_teacher
 * author name:  
 * create time: 2020-07-30 15:36:31
 */ 
public class ExamTeacher extends EntityHelper{

	private int teacherId;
	private String teacherName;
	private String sex;
	private int age;
	private String phone;
	private String position;
	private int roomId;
	private int examRoomId;

	public ExamTeacher() {
		super();
	}
	public ExamTeacher(int teacherId,String teacherName,String sex,int age,String phone,String position,int roomId,int examRoomId) {
		this.teacherId=teacherId;
		this.teacherName=teacherName;
		this.sex=sex;
		this.age=age;
		this.phone=phone;
		this.position=position;
		this.roomId=roomId;
		this.examRoomId=examRoomId;
	}
	public void setTeacherId(int teacherId){
		this.teacherId=teacherId;
	}
	public int getTeacherId(){
		return teacherId;
	}
	public void setTeacherName(String teacherName){
		this.teacherName=teacherName;
	}
	public String getTeacherName(){
		return teacherName;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setPosition(String position){
		this.position=position;
	}
	public String getPosition(){
		return position;
	}
	public void setRoomId(int roomId){
		this.roomId=roomId;
	}
	public int getRoomId(){
		return roomId;
	}
	public void setExamRoomId(int examRoomId){
		this.examRoomId=examRoomId;
	}
	public int getExamRoomId(){
		return examRoomId;
	}
	@Override
	public String toString() {
		return "exam_teacher[" + 
			"teacherId=" + teacherId + 
			", teacherName=" + teacherName + 
			", sex=" + sex + 
			", age=" + age + 
			", phone=" + phone + 
			", position=" + position + 
			", roomId=" + roomId + 
			", examRoomId=" + examRoomId + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "teacherId";
	}
}

