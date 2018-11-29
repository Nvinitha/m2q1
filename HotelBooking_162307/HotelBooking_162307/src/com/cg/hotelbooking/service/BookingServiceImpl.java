package com.cg.hotelbooking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hotelbooking.bean.HotelDetailsBean;
import com.cg.hotelbooking.dao.IBookingDAO;

@Service("bookingService")
@Transactional
public class BookingServiceImpl implements IBookingService 
{
	@Autowired
	IBookingDAO bookingDAO;

	@Override
	public List<HotelDetailsBean> showAllHotels() 
	{
		
		return bookingDAO.showAllHotels();
	
	}

	@Override
	public String getBookedHotel(HotelDetailsBean hotelDetailsBean) 
	{
		
		return bookingDAO.getBookedHotel(hotelDetailsBean);
	}

	@Override
	public List<HotelDetailsBean> findHotelName() {

		return bookingDAO.findHotelName();
	}

}
