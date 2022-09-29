package com.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RoomDetails {
	
	
	@Id
	@GeneratedValue
	int room_id;
	
	int hotel_id;
	
	String room_no;
	String room_type;
	double rate_per_day;
	boolean isavailable;
	
	
	@ManyToOne
	@JoinColumn(name = "hid", referencedColumnName = "hotel_id")
	Hotel htl;
	
	
	
	
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public double getRate_per_day() {
		return rate_per_day;
	}
	public void setRate_per_day(double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}
	public boolean isIsavailable() {
		return isavailable;
	}
	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}
	@Override
	public String toString() {
		return "RoomDetails [room_id=" + room_id + ", hotel_id=" + hotel_id + ", room_no=" + room_no + ", room_type="
				+ room_type + ", rate_per_day=" + rate_per_day + ", isavailable=" + isavailable + "]";
	}
	
	
	

}
