package com.numad.numad2.Service;

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

}
