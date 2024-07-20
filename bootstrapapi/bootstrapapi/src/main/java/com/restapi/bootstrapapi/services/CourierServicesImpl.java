package com.restapi.bootstrapapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.bootstrapapi.dao.CourierDao;
import com.restapi.bootstrapapi.entities.Courier;

@Service

public class CourierServicesImpl implements ControllerServices {
	//List<Courier>list;
    private  CourierDao courierDao;
	@Override
	public List<Courier> getCouriers() {
		
		return courierDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Courier getCouriers(long shipperId) {
		
		return courierDao.getOne(shipperId);
	}

	@Override
	public Courier addCouriers(Courier courier) {
		courierDao.save(courier);
		return courier;
	}

	@Override
	public Courier updateCourier(Courier courier) {
		courierDao.save(courier);
		return courier;
	}

	@Override
	public void deleteCourier(long parseLong) {
	@SuppressWarnings({ "deprecation", "unused" })
	Courier entity = courierDao.getOne(parseLong);
	courierDao.delete(entity);
		
	}
	
	

}
