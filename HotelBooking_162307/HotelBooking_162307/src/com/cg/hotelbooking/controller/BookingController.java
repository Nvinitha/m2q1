package com.cg.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hotelbooking.bean.HotelDetailsBean;
import com.cg.hotelbooking.service.IBookingService;

@Controller
public class BookingController 
{
	@Autowired
	IBookingService bookingService;
	

	@RequestMapping(value="hotelDetails",method=RequestMethod.GET)// the GET for displaying data in the form,
	public ModelAndView showAllHotels()
	{
		List<HotelDetailsBean> hotelList=bookingService.showAllHotels();
		return new ModelAndView("HotelDetails","list", hotelList);
	}
	
	@RequestMapping(value="hotelbook",method=RequestMethod.GET)// the GET for displaying data in the form,
	public ModelAndView bookingConfirmation(HotelDetailsBean hotelDetailsBean)
	{
		String hotelName= bookingService.getBookedHotel(hotelDetailsBean);
		return new ModelAndView("BookingConfirmation","temp", hotelName);
	}

}
