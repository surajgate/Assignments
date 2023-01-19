package com.met.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "REGISTRATION")
public class Registration {

	@Id
	private String emailId;
	private String fName;
	private int mobNo;
	private String address;
	private String password;
	private String cPassword;
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	@Override
	public String toString() {
		return "Registration [FName=" + FName + ", EmailId=" + EmailId + ", mobNo=" + mobNo + ", address=" + address
				+ ", password=" + password + ", cPassword=" + cPassword + "]";
	}
	
}
