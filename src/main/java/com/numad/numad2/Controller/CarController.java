package com.numad.numad2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numad.numad2.Model.CarInfo;
import com.numad.numad2.Repository.CarInfoRepo;

@RestController
public class CarController {
	
	@Autowired
	CarInfoRepo carInfoRepo;
	
	
	@PostMapping("/RegisterCar")
	public void RegisterCar(@RequestBody CarInfo carInfo)
	{
		carInfoRepo.save(carInfo);
		
	}
	
	@GetMapping("/RegisterCar")
	public String registerCarGet(Model model)
	{
		return "RegisterCar";
	}

	
	

}
