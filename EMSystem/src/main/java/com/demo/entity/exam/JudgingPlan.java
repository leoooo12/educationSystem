package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  judging_plan
 * author name:  
 * create time: 2020-07-30 15:36:31
 */ 
public class JudgingPlan extends EntityHelper{

	private int planCode;
	private int publishId;
	private Date judgingStart;
	private Date judgingEnd;
	private int schoolCode;
	private String schoolName;
	private String paperCode;
	private int paperNum;

	public JudgingPlan() {
		super();
	}
	public JudgingPlan(int planCode,int publishId,Date judgingStart,Date judgingEnd,int schoolCode,String schoolName,String paperCode,int paperNum) {
		this.planCode=planCode;
		this.publishId=publishId;
		this.judgingStart=judgingStart;
		this.judgingEnd=judgingEnd;
		this.schoolCode=schoolCode;
		this.schoolName=schoolName;
		this.paperCode=paperCode;
		this.paperNum=paperNum;
	}
	public void setPlanCode(int planCode){
		this.planCode=planCode;
	}
	public int getPlanCode(){
		return planCode;
	}
	public void setPublishId(int publishId){
		this.publishId=publishId;
	}
	public int getPublishId(){
		return publishId;
	}
	public void setJudgingStart(Date judgingStart){
		this.judgingStart=judgingStart;
	}
	public Date getJudgingStart(){
		return judgingStart;
	}
	public void setJudgingEnd(Date judgingEnd){
		this.judgingEnd=judgingEnd;
	}
	public Date getJudgingEnd(){
		return judgingEnd;
	}
	public void setSchoolCode(int schoolCode){
		this.schoolCode=schoolCode;
	}
	public int getSchoolCode(){
		return schoolCode;
	}
	public void setSchoolName(String schoolName){
		this.schoolName=schoolName;
	}
	public String getSchoolName(){
		return schoolName;
	}
	public void setPaperCode(String paperCode){
		this.paperCode=paperCode;
	}
	public String getPaperCode(){
		return paperCode;
	}
	public void setPaperNum(int paperNum){
		this.paperNum=paperNum;
	}
	public int getPaperNum(){
		return paperNum;
	}
	@Override
	public String toString() {
		return "judging_plan[" + 
			"planCode=" + planCode + 
			", publishId=" + publishId + 
			", judgingStart=" + judgingStart + 
			", judgingEnd=" + judgingEnd + 
			", schoolCode=" + schoolCode + 
			", schoolName=" + schoolName + 
			", paperCode=" + paperCode + 
			", paperNum=" + paperNum + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "planCode";
	}
}

