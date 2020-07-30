package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  publish_exam
 * author name:  
 * create time: 2020-07-30 15:36:32
 */ 
public class PublishExam extends EntityHelper{

	private int publishId;
	private int typeId;
	private Date registrationStarts;
	private Date registrationDeadline;
	private Date applyStarts;
	private Date applyDeadline;
	private Date confirmationStarts;
	private Date confirmationDeadline;
	private Date admissioncardPrintStarts;
	private Date admissioncardPrintDeadline;
	private String userId;
	private Date publishTime;

	public PublishExam() {
		super();
	}
	public PublishExam(int publishId,int typeId,Date registrationStarts,Date registrationDeadline,Date applyStarts,Date applyDeadline,Date confirmationStarts,Date confirmationDeadline,Date admissioncardPrintStarts,Date admissioncardPrintDeadline,String userId,Date publishTime) {
		this.publishId=publishId;
		this.typeId=typeId;
		this.registrationStarts=registrationStarts;
		this.registrationDeadline=registrationDeadline;
		this.applyStarts=applyStarts;
		this.applyDeadline=applyDeadline;
		this.confirmationStarts=confirmationStarts;
		this.confirmationDeadline=confirmationDeadline;
		this.admissioncardPrintStarts=admissioncardPrintStarts;
		this.admissioncardPrintDeadline=admissioncardPrintDeadline;
		this.userId=userId;
		this.publishTime=publishTime;
	}
	public void setPublishId(int publishId){
		this.publishId=publishId;
	}
	public int getPublishId(){
		return publishId;
	}
	public void setTypeId(int typeId){
		this.typeId=typeId;
	}
	public int getTypeId(){
		return typeId;
	}
	public void setRegistrationStarts(Date registrationStarts){
		this.registrationStarts=registrationStarts;
	}
	public Date getRegistrationStarts(){
		return registrationStarts;
	}
	public void setRegistrationDeadline(Date registrationDeadline){
		this.registrationDeadline=registrationDeadline;
	}
	public Date getRegistrationDeadline(){
		return registrationDeadline;
	}
	public void setApplyStarts(Date applyStarts){
		this.applyStarts=applyStarts;
	}
	public Date getApplyStarts(){
		return applyStarts;
	}
	public void setApplyDeadline(Date applyDeadline){
		this.applyDeadline=applyDeadline;
	}
	public Date getApplyDeadline(){
		return applyDeadline;
	}
	public void setConfirmationStarts(Date confirmationStarts){
		this.confirmationStarts=confirmationStarts;
	}
	public Date getConfirmationStarts(){
		return confirmationStarts;
	}
	public void setConfirmationDeadline(Date confirmationDeadline){
		this.confirmationDeadline=confirmationDeadline;
	}
	public Date getConfirmationDeadline(){
		return confirmationDeadline;
	}
	public void setAdmissioncardPrintStarts(Date admissioncardPrintStarts){
		this.admissioncardPrintStarts=admissioncardPrintStarts;
	}
	public Date getAdmissioncardPrintStarts(){
		return admissioncardPrintStarts;
	}
	public void setAdmissioncardPrintDeadline(Date admissioncardPrintDeadline){
		this.admissioncardPrintDeadline=admissioncardPrintDeadline;
	}
	public Date getAdmissioncardPrintDeadline(){
		return admissioncardPrintDeadline;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return userId;
	}
	public void setPublishTime(Date publishTime){
		this.publishTime=publishTime;
	}
	public Date getPublishTime(){
		return publishTime;
	}
	@Override
	public String toString() {
		return "publish_exam[" + 
			"publishId=" + publishId + 
			", typeId=" + typeId + 
			", registrationStarts=" + registrationStarts + 
			", registrationDeadline=" + registrationDeadline + 
			", applyStarts=" + applyStarts + 
			", applyDeadline=" + applyDeadline + 
			", confirmationStarts=" + confirmationStarts + 
			", confirmationDeadline=" + confirmationDeadline + 
			", admissioncardPrintStarts=" + admissioncardPrintStarts + 
			", admissioncardPrintDeadline=" + admissioncardPrintDeadline + 
			", userId=" + userId + 
			", publishTime=" + publishTime +
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "publishId";
	}
}

