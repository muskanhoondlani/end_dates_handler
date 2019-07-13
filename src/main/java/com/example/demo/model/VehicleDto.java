package com.example.demo.model;

import com.example.demo.entity.Vehicle;

public class VehicleDto {
	
	public VehicleDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public VehicleDto(Vehicle vehicle) {
		super();
		this.id = vehicle.getId();
		this.vehicleName = vehicle.getVehicleName();
		this.vehicleSpec = vehicle.getVehicleSpec();
		this.vehicleService = vehicle.getVehicleService();
		this.vehicleInsurance = vehicle.getVehicleInsurance();
		this.vehiclePrice = vehicle.getVehiclePrice();
	}

	private Long id;
	private String vehicleName;
	private String vehicleSpec;
    private String vehicleService;
    private String vehicleInsurance;
    private String vehiclePrice;
    private Long userId;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleSpec() {
		return vehicleSpec;
	}
	public void setVehicleSpec(String vehicleSpec) {
		this.vehicleSpec = vehicleSpec;
	}
	public String getVehicleService() {
		return vehicleService;
	}
	public void setVehicleService(String vehicleService) {
		this.vehicleService = vehicleService;
	}
	public String getVehicleInsurance() {
		return vehicleInsurance;
	}
	public void setVehicleInsurance(String vehicleInsurance) {
		this.vehicleInsurance = vehicleInsurance;
	}
	public String getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(String vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
    
    
}
