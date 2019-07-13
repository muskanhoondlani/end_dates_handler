package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.example.demo.model.VehicleDto;

@Entity
public class Vehicle {
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotBlank(message = "Vehicle Name is mandatory")
	private String vehicleName;
	
	@Column
	@NotEmpty
	private String vehicleSpec;
	
	@Column
	@NotEmpty
	private String vehicleService;
	
	@Column
	@NotEmpty
	private String vehicleInsurance;
	
	@Column
	@NotEmpty
	private String vehiclePrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "user_id",insertable = false,updatable = false)
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

	public Vehicle(VehicleDto vehicle) {
		super();
		this.vehicleName = vehicle.getVehicleName();
		this.vehicleSpec = vehicle.getVehicleSpec();
		this.vehicleService = vehicle.getVehicleService();
		this.vehicleInsurance = vehicle.getVehicleInsurance();
		this.vehiclePrice = vehicle.getVehiclePrice();
	}
	
	public Vehicle(Long id) {
		this.id = id;
	}
	

}
