package com.example.demo.model;

import com.example.demo.entity.Appliance;

public class ApplianceDto {
	
	public ApplianceDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ApplianceDto(Appliance appliance) {
		super();
		this.id = appliance.getId();
		this.applianceName = appliance.getApplianceName();
		this.appliancePrice = appliance.getAppliancePrice();
		this.applianceService = appliance.getApplianceService();
		this.applianceWarranty = appliance.getApplianceWarranty();
		this.applianceSpec = appliance.getApplianceSpec();
	}
	
	
	private Long id;
	private String applianceName;
	private String applianceSpec;
    private String applianceService;
    private String applianceWarranty;
    private String appliancePrice;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
    
    

}
