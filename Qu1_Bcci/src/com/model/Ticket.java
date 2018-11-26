package com.model;

import java.util.Date;


public class Ticket {

	int id;
	String audienceName;
	String nationality;
	int age;
	String cellNo;
	Date reserveDate;
	
	Ticket obj=new Ticket();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAudienceName() {
		return audienceName;
	}
	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCellNo() {
		return cellNo;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	public Date getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}
	public Ticket(int id, String audienceName, String nationality, int age, String cellNo, Date reserveDate) {
		super();
		this.id = id;
		this.audienceName = audienceName;
		this.nationality = nationality;
		this.age = age;
		this.cellNo = cellNo;
		this.reserveDate = reserveDate;
	}
	public Ticket() {
		obj.setId(id);
		obj.setAudienceName(audienceName);
		obj.setNationality(nationality);
		obj.setAge(age);
		obj.setCellNo(cellNo);
		obj.setReserveDate(reserveDate);
		Booking.ticketList.add(obj);
		// TODO Auto-generated constructor stub
	}
	
	
}
	
	
	
	


