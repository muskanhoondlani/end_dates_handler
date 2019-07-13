package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appliance;
import com.example.demo.entity.repository.ApplianceRepository;
import com.example.demo.model.ApplianceDto;;
@Service
public class ApplianceService {
	
	@Autowired
	ApplianceRepository applianceRepository;
	
	
	public void saveAppliance(ApplianceDto appliance) {
		Appliance entity = null;
		if(appliance.getId() !=null) {
			Optional<Appliance> applianceEntity = applianceRepository.findById(appliance.getId());
			if(applianceEntity.isPresent()) {
				entity = applianceEntity.get();
				entity.setApplianceName(appliance.getApplianceName());
				entity.setAppliancePrice(appliance.getAppliancePrice());
				entity.setApplianceService(appliance.getApplianceService());
				entity.setApplianceSpec(appliance.getApplianceSpec());
				entity.setApplianceWarranty(appliance.getApplianceWarranty());
			}
			
		}else {
			entity = new Appliance(appliance);
		}
		
		applianceRepository.save(entity);
	}
	
	public void deleteAppliances(ApplianceDto appliance) {
		Appliance entity = null;
		if(appliance.getId() !=null) {
			Optional<Appliance> applianceEntity = applianceRepository.findById(appliance.getId());
			if(applianceEntity.isPresent()) {
				entity = applianceEntity.get();
			}
		}else {
			entity = new Appliance(appliance);
		}
		
		applianceRepository.delete(entity);
	
		
	}
	
	
	public Appliance findByAppliancename(String appliancename) {
		return applianceRepository.findByApplianceName(appliancename);
	}
	
	
	public List<ApplianceDto> findAllApplianceForUser(Long userId){
		List<Appliance> list =  applianceRepository.findAll();
		
		return list.stream().map(ApplianceDto::new).collect(Collectors.toList());
	}

	
	public ApplianceDto findById(Long applianceId) {
		Optional<Appliance> applianceEntity =  applianceRepository.findById(applianceId);
		if(applianceEntity.isPresent())
			return new ApplianceDto(applianceEntity.get());
		else
			return null;
	}
	
	public void deleteAppliance(Long id) {
		Appliance toDelete = new Appliance(id);
		applianceRepository.delete(toDelete);
		
	}

	

}
