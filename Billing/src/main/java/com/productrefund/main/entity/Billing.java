package com.productrefund.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name = "CREDIT_PAYMENT")
	public class Billing {
	@Id
	@GeneratedValue
	private  int id;
	private  String CARD;
	private  int PIN;
	private  double AMOUNT;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCARD() {
		return CARD;
	}
	public void setCARD(String cARD) {
		CARD = cARD;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public double getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}

}
