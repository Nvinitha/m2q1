package com.cg.hotelbooking.dao;

import java.util.List;

import com.cg.hotelbooking.bean.HotelDetailsBean;

public interface IBookingDAO 
{

	List<HotelDetailsBean> showAllHotels();

	List<HotelDetailsBean> findHotelName();

	String getBookedHotel(HotelDetailsBean hotelDetailsBean);

}
