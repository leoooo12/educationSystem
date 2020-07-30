package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  violations_code
 * author name:  
 * create time: 2020-07-30 15:36:32
 */ 
public class ViolationsCode extends EntityHelper{

	private int violationsCode;
	private String violationsDes;
	private int punishmentDes;

	public ViolationsCode() {
		super();
	}
	public ViolationsCode(int violationsCode,String violationsDes,int punishmentDes) {
		this.violationsCode=violationsCode;
		this.violationsDes=violationsDes;
		this.punishmentDes=punishmentDes;
	}
	public void setViolationsCode(int violationsCode){
		this.violationsCode=violationsCode;
	}
	public int getViolationsCode(){
		return violationsCode;
	}
	public void setViolationsDes(String violationsDes){
		this.violationsDes=violationsDes;
	}
	public String getViolationsDes(){
		return violationsDes;
	}
	public void setPunishmentDes(int punishmentDes){
		this.punishmentDes=punishmentDes;
	}
	public int getPunishmentDes(){
		return punishmentDes;
	}
	@Override
	public String toString() {
		return "violations_code[" + 
			"violationsCode=" + violationsCode + 
			", violationsDes=" + violationsDes + 
			", punishmentDes=" + punishmentDes + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "violationsCode";
	}
}

