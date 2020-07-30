package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  exam_type
 * author name:  
 * create time: 2020-07-30 15:36:31
 */ 
public class ExamType extends EntityHelper{

	private int typeId;
	private String typeName;
	private String certificate;
	private String userId;
	private Date createTime;

	public ExamType() {
		super();
	}
	public ExamType(int typeId,String typeName,String certificate,String userId,Date createTime) {
		this.typeId=typeId;
		this.typeName=typeName;
		this.certificate=certificate;
		this.userId=userId;
		this.createTime=createTime;
	}
	public void setTypeId(int typeId){
		this.typeId=typeId;
	}
	public int getTypeId(){
		return typeId;
	}
	public void setTypeName(String typeName){
		this.typeName=typeName;
	}
	public String getTypeName(){
		return typeName;
	}
	public void setCertificate(String certificate){
		this.certificate=certificate;
	}
	public String getCertificate(){
		return certificate;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return userId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	@Override
	public String toString() {
		return "exam_type[" + 
			"typeId=" + typeId + 
			", typeName=" + typeName + 
			", certificate=" + certificate + 
			", userId=" + userId + 
			", createTime=" + createTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "typeId";
	}
}

