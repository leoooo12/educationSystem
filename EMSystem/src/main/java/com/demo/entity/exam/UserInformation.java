package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  user_information
 * author name:  
 * create time: 2020-07-30 15:36:32
 */ 
public class UserInformation extends EntityHelper{

	private int userId;
	private String userName;
	private String password;
	private String sex;
	private int age;
	private String institute;
	private String certificateType;
	private String certificateId;
	private String phone;
	private String email;
	private int role;

	public UserInformation() {
		super();
	}
	public UserInformation(int userId,String userName,String password,String sex,int age,String institute,String certificateType,String certificateId,String phone,String email,int role) {
		this.userId=userId;
		this.userName=userName;
		this.password=password;
		this.sex=sex;
		this.age=age;
		this.institute=institute;
		this.certificateType=certificateType;
		this.certificateId=certificateId;
		this.phone=phone;
		this.email=email;
		this.role=role;
	}
	public void setUserId(int userId){
		this.userId=userId;
	}
	public int getUserId(){
		return userId;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
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
	public void setInstitute(String institute){
		this.institute=institute;
	}
	public String getInstitute(){
		return institute;
	}
	public void setCertificateType(String certificateType){
		this.certificateType=certificateType;
	}
	public String getCertificateType(){
		return certificateType;
	}
	public void setCertificateId(String certificateId){
		this.certificateId=certificateId;
	}
	public String getCertificateId(){
		return certificateId;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setRole(int role){
		this.role=role;
	}
	public int getRole(){
		return role;
	}
	@Override
	public String toString() {
		return "user_information[" + 
			"userId=" + userId + 
			", userName=" + userName + 
			", password=" + password + 
			", sex=" + sex + 
			", age=" + age + 
			", institute=" + institute + 
			", certificateType=" + certificateType + 
			", certificateId=" + certificateId + 
			", phone=" + phone + 
			", email=" + email + 
			", role=" + role + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "userId";
	}
}

