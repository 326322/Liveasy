package com.restapi.bootstrapapi.entities;

import jakarta.persistence.Entity;

@Entity

public class Courier {
      private String loadingPoint;
      @Override
	public String toString() {
		return "Courier [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", chemicals="
				+ chemicals + ", truckType=" + truckType + ", noOfTruck=" + noOfTruck + ", weight=" + weight
				+ ", shipperId=" + shipperId + ", Date=" + Date + "]";
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getChemicals() {
		return chemicals;
	}
	public void setChemicals(String chemicals) {
		this.chemicals = chemicals;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTruck() {
		return noOfTruck;
	}
	public void setNoOfTruck(int noOfTruck) {
		this.noOfTruck = noOfTruck;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public long getDate() {
		return Date;
	}
	public void setDate(long date) {
		Date = date;
	}
	private String unloadingPoint;
      private String chemicals;
      private String truckType;
      private int noOfTruck;
      private int weight;
      private long shipperId;
      private long Date;
	public Courier(String loadingPoint, String unloadingPoint, String chemicals, String truckType, int noOfTruck,
			int weight, long shipperId, long date) {
		super();
		this.setLoadingPoint(loadingPoint);
		this.unloadingPoint = unloadingPoint;
		this.chemicals = chemicals;
		this.truckType = truckType;
		this.noOfTruck = noOfTruck;
		this.weight = weight;
		this.shipperId = shipperId;
		Date = date;
	}
	public Courier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
      
}
