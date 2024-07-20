package com.restapi.bootstrapapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.bootstrapapi.services.ControllerServices;

import com.restapi.bootstrapapi.entities.Courier;

@RestController
public class MyController {
	@Autowired
	private ControllerServices courierServices;
        
	@GetMapping("/home")
	public String home() {
		return "Welcome to Liveasy";
	}
	@GetMapping("/courier")
	public List<Courier> getCouriers1(){
		return this.courierServices.getCouriers();
		
	}
	
	@GetMapping("/courier/{shipperId}")
	public Courier getCouriers(@PathVariable String shipperId) {
		return this.courierServices.getCouriers(Long.parseLong(shipperId));
	}
	@PostMapping("/courier")
	public Courier addCouriers(@RequestBody Courier courier) {
		 
		   return this.courierServices.addCouriers(courier);
				   
	}			   
	@PutMapping("/courier")
	public Courier updateCouriers(@RequestBody Courier courier ) {
		return this.courierServices.updateCourier(courier);
	}
	
	/*@DeleteMapping("courier/{shipperId}")
	public ResponseEntity<HttpStatus> deleteCourier(Long.parseLong(shipperId)){
		try {
			this.courierServices.deleteCourse(Long.parseLong(shipperId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}*/
	
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
	
}
