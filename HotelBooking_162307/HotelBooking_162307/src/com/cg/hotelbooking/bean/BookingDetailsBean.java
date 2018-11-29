package com.cg.hotelbooking.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookingdetails")
public class BookingDetailsBean 
{
	@Id
	@Column(name="id")
	private int bookingId;
	
	@Column(name="customername")
	private String customerName;
	
	@Column(name="hotelid")
	private int hotel_Id;
	
	@Column(name="todate")
	private Date to_Date;
	
	@Column(name="fromdate")
	private Date from_Date;
	
	@Column(name="noofrooms")
	private int no_of_rooms;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getHotel_Id() {
		return hotel_Id;
	}

	public void setHotel_Id(int hotel_Id) {
		this.hotel_Id = hotel_Id;
	}

	public Date getTo_Date() {
		return to_Date;
	}

	public void setTo_Date(Date to_Date) {
		this.to_Date = to_Date;
	}

	public Date getFrom_Date() {
		return from_Date;
	}

	public void setFrom_Date(Date from_Date) {
		this.from_Date = from_Date;
	}

	public int getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}
	
	

}
