package com.demo.entity.exam;

import java.util.Date;
/**
 * table name:  penalty_code
 * author name:  
 * create time: 2020-07-30 15:36:32
 */ 
public class PenaltyCode extends EntityHelper{

	private int punishmentCode;
	private String punishmentDes;

	public PenaltyCode() {
		super();
	}
	public PenaltyCode(int punishmentCode,String punishmentDes) {
		this.punishmentCode=punishmentCode;
		this.punishmentDes=punishmentDes;
	}
	public void setPunishmentCode(int punishmentCode){
		this.punishmentCode=punishmentCode;
	}
	public int getPunishmentCode(){
		return punishmentCode;
	}
	public void setPunishmentDes(String punishmentDes){
		this.punishmentDes=punishmentDes;
	}
	public String getPunishmentDes(){
		return punishmentDes;
	}
	@Override
	public String toString() {
		return "penalty_code[" + 
			"punishmentCode=" + punishmentCode + 
			", punishmentDes=" + punishmentDes + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "punishmentCode";
	}
}

