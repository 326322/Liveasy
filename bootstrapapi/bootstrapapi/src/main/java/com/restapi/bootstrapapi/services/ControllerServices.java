package com.restapi.bootstrapapi.services;
import java.util.List;
import com.restapi.bootstrapapi.entities.Courier;


public interface ControllerServices {
   
	public List<Courier> getCouriers();
	
	public Courier getCouriers(long shipperId);

	public Courier addCouriers(Courier courier);
	
	public Courier updateCourier(Courier courier);
	
	public void deleteCourier(long parseLong);
	;
}
