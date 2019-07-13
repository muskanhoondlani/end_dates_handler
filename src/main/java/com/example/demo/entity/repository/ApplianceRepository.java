package com.example.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Appliance;


@Repository
public interface ApplianceRepository extends JpaRepository<Appliance, Long>{
	
	public Appliance findByApplianceName(String applianceName);
	 
}

