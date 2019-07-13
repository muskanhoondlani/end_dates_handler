package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Vehicle;
import com.example.demo.entity.repository.VehicleRepository;
import com.example.demo.model.VehicleDto;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	public void saveVehicle(VehicleDto vehicle) {
		Vehicle entity = null;
		if(vehicle.getId() !=null) {
			Optional<Vehicle> vehicleEntity = vehicleRepository.findById(vehicle.getId());
			if(vehicleEntity.isPresent()) {
				entity = vehicleEntity.get();
				entity.setVehicleName(vehicle.getVehicleName());
				entity.setVehiclePrice(vehicle.getVehiclePrice());
				entity.setVehicleService(vehicle.getVehicleService());
				entity.setVehicleSpec(vehicle.getVehicleSpec());
				entity.setVehicleInsurance(vehicle.getVehicleInsurance());
			}
			
		}else {
			entity = new Vehicle(vehicle);
		}
		
		vehicleRepository.save(entity);
	}

	public List<VehicleDto> findAllVehicleForUser(long userId) {
		
		List<Vehicle> list = vehicleRepository.findAll();
		return list.stream().map(VehicleDto::new).collect(Collectors.toList());
	}

}
