package com.cg.hotelbooking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.hotelbooking.bean.HotelDetailsBean;

@Repository("bookingDAO")
public class BookingDAOImpl implements IBookingDAO 
{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<HotelDetailsBean> showAllHotels() 
	{
		Query queryone = entityManager.createQuery("FROM HotelDetailsBean");
		List<HotelDetailsBean> hotelList = queryone.getResultList();
		return hotelList;
	}

	@Override
	public List<HotelDetailsBean> findHotelName() 
	{	
		Query query=entityManager.createNativeQuery("Select * from HotelDetailsBean hotel where hotel.name = ?",HotelDetailsBean.class);
	query.setParameter(1,1);

	List<HotelDetailsBean> hotelname = query.getResultList();
	System.out.println(hotelname);
	return hotelname;

	}

	@Override
	public String getBookedHotel(HotelDetailsBean hotelDetailsBean) 
	{
		
		return hotelDetailsBean.getHotelName();
	}

}
