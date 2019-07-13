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

import com.example.demo.model.ApplianceDto;

@Entity
public class Appliance {
	
	public Appliance() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotBlank(message = "Appliance Name is mandatory")
	private String applianceName;
	
	@Column
	@NotEmpty
	private String applianceSpec;
	
	@Column
	@NotEmpty
	private String applianceService;
	
	@Column
	@NotEmpty
	private String applianceWarranty;
	
	@Column
	@NotEmpty
	private String appliancePrice;
	
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

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public String getApplianceSpec() {
		return applianceSpec;
	}

	public void setApplianceSpec(String applianceSpec) {
		this.applianceSpec = applianceSpec;
	}

	public String getApplianceService() {
		return applianceService;
	}

	public void setApplianceService(String applianceService) {
		this.applianceService = applianceService;
	}

	public String getApplianceWarranty() {
		return applianceWarranty;
	}

	public void setApplianceWarranty(String applianceWarranty) {
		this.applianceWarranty = applianceWarranty;
	}

	public String getAppliancePrice() {
		return appliancePrice;
	}

	public void setAppliancePrice(String appliancePrice) {
		this.appliancePrice = appliancePrice;
	}

	public Appliance(ApplianceDto appliance) {
		super();
		this.applianceName = appliance.getApplianceName();
		this.applianceSpec = appliance.getApplianceSpec();
		this.applianceService = appliance.getApplianceService();
		this.applianceWarranty = appliance.getApplianceWarranty();
		this.appliancePrice = appliance.getAppliancePrice();
	}

	public Appliance(Long id) {
		this.id = id;
	}

	
}
