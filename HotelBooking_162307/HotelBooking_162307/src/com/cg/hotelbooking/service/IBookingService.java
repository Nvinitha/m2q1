package com.cg.hotelbooking.service;

import java.util.List;

import com.cg.hotelbooking.bean.HotelDetailsBean;


public interface IBookingService 
{

	List<HotelDetailsBean> showAllHotels();

	String getBookedHotel(HotelDetailsBean hotelDetailsBean);

	List<HotelDetailsBean> findHotelName();

}
