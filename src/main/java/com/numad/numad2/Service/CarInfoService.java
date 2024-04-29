package com.numad.numad2.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numad.numad2.Model.CarInfo;
import com.numad.numad2.Repository.CarInfoRepo;

@Service
public class CarInfoService {
	
	@Autowired
	CarInfoRepo carInfoRepo;
	
	public void RegCar(CarInfo carInfo)
	{
		carInfoRepo.save(carInfo);
		
	}
	
	public void delCarInfoById(int carId)
	{
		carInfoRepo.deleteById(carId);
	}
	
	
	public Optional<CarInfo> getCarInfoById(int carId) {
		
	
	//public String getCarInfoById(int carId)
	//public Optional<CarInfo> getCarInfoById(int carId)
	
		//return carInfoRepo.findById(carId);
		return carInfoRepo.findById(carId);
		
	}
	

}
