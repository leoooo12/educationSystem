package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  violation_info
 * author name:  
 * create time: 2020-07-30 15:36:32
 */ 
public class ViolationInfo extends EntityHelper{

	private int violateRecordId;
	private int userId;
	private String publishId;
	private int violationsCode;
	private String violateDescription;
	private int previewStatus;
	private int punishmentCode;
	private String punishDescription;
	private String reportMan;
	private Date reportTime;
	private String punishMan;
	private Date punishTime;
	private String processing_state;

	public ViolationInfo() {
		super();
	}
	public ViolationInfo(int violateRecordId,int userId,String publishId,int violationsCode,String violateDescription,int previewStatus,int punishmentCode,String punishDescription,String reportMan,Date reportTime,String punishMan,Date punishTime,String processing_state) {
		this.violateRecordId=violateRecordId;
		this.userId=userId;
		this.publishId=publishId;
		this.violationsCode=violationsCode;
		this.violateDescription=violateDescription;
		this.previewStatus=previewStatus;
		this.punishmentCode=punishmentCode;
		this.punishDescription=punishDescription;
		this.reportMan=reportMan;
		this.reportTime=reportTime;
		this.punishMan=punishMan;
		this.punishTime=punishTime;
		this.processing_state=processing_state;
	}
	public void setViolateRecordId(int violateRecordId){
		this.violateRecordId=violateRecordId;
	}
	public int getViolateRecordId(){
		return violateRecordId;
	}
	public void setUserId(int userId){
		this.userId=userId;
	}
	public int getUserId(){
		return userId;
	}
	public void setPublishId(String publishId){
		this.publishId=publishId;
	}
	public String getPublishId(){
		return publishId;
	}
	public void setViolationsCode(int violationsCode){
		this.violationsCode=violationsCode;
	}
	public int getViolationsCode(){
		return violationsCode;
	}
	public void setViolateDescription(String violateDescription){
		this.violateDescription=violateDescription;
	}
	public String getViolateDescription(){
		return violateDescription;
	}
	public void setPreviewStatus(int previewStatus){
		this.previewStatus=previewStatus;
	}
	public int getPreviewStatus(){
		return previewStatus;
	}
	public void setPunishmentCode(int punishmentCode){
		this.punishmentCode=punishmentCode;
	}
	public int getPunishmentCode(){
		return punishmentCode;
	}
	public void setPunishDescription(String punishDescription){
		this.punishDescription=punishDescription;
	}
	public String getPunishDescription(){
		return punishDescription;
	}
	public void setReportMan(String reportMan){
		this.reportMan=reportMan;
	}
	public String getReportMan(){
		return reportMan;
	}
	public void setReportTime(Date reportTime){
		this.reportTime=reportTime;
	}
	public Date getReportTime(){
		return reportTime;
	}
	public void setPunishMan(String punishMan){
		this.punishMan=punishMan;
	}
	public String getPunishMan(){
		return punishMan;
	}
	public void setPunishTime(Date punishTime){
		this.punishTime=punishTime;
	}
	public Date getPunishTime(){
		return punishTime;
	}
	public void setProcessing_state(String processing_state){
		this.processing_state=processing_state;
	}
	public String getProcessing_state(){
		return processing_state;
	}
	@Override
	public String toString() {
		return "violation_info[" + 
			"violateRecordId=" + violateRecordId + 
			", userId=" + userId + 
			", publishId=" + publishId + 
			", violationsCode=" + violationsCode + 
			", violateDescription=" + violateDescription + 
			", previewStatus=" + previewStatus + 
			", punishmentCode=" + punishmentCode + 
			", punishDescription=" + punishDescription + 
			", reportMan=" + reportMan + 
			", reportTime=" + reportTime + 
			", punishMan=" + punishMan + 
			", punishTime=" + punishTime +
			", processing_state=" + processing_state + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "violateRecordId";
	}
}

