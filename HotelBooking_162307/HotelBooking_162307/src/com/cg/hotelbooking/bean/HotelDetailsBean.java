package com.cg.hotelbooking.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hoteldetails")
public class HotelDetailsBean 
{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hotelId;
	
	@Column(name="Name")
	private String hotelName;
	
	@Column(name="Rating")
	private String hotelRating;
	
	@Column(name="Rate")
	private double hotelRate;
	
	@Column(name="AvailableRooms")
	private int availableRooms;
	
	//Getters and Setters

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}

	public double getHotelRate() {
		return hotelRate;
	}

	public void setHotelRate(double hotelRate) {
		this.hotelRate = hotelRate;
	}

	public int getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}
	
	
	
}
