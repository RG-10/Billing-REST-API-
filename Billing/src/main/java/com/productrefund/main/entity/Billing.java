package com.productrefund.main.entity;

import javax.persistence.Column;

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
	@Table(name="Bill-db")
	public class Billing {
	@Id
	@GeneratedValue
	
	@Column(name= "UserId")
	private  int id;
	
	@Column(name= "UserName")
	private int Name;
	
	private  String CARD;
	@Column(name= "PIN Number")
	private  int PIN;
	
	@Column(name= "BillingAmount")
	private  double AMOUNT;
	
	@Column(name="CardIsActive")
	private boolean cardIsActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return Name;
	}

	public void setName(int name) {
		Name = name;
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

	public boolean isCourseIsActive() {
		return cardIsActive;
	}

	public void setCourseIsActive(boolean courseIsActive) {
		this.cardIsActive = courseIsActive;
	}


	

}
