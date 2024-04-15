package com.numad.numad2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numad.numad2.Model.CarInfo;
import com.numad.numad2.Repository.CarInfoRepo;
import com.numad.numad2.Service.CarInfoService;

@RestController
public class CarController {
	
	@Autowired
	CarInfoRepo carInfoRepo;
	
	@Autowired
	CarInfoService carInfoService;
	
	@GetMapping("/admin")
	public String adminHome()
	{
		return "AdminHome";
	}
	
	
	@PostMapping("admin/RegisterCar")
	public void RegisterCar(@RequestBody CarInfo carInfo)
	{
		carInfoRepo.save(carInfo);
		
	}
	
	@GetMapping("admin/RegisterCar")
	public String registerCarGet(Model model)
	{
		model.addAttribute("carInfo", new CarInfo());
		
		return "RegisterCar";
	}
	
	@PostMapping("/RegisterCar")
	public String RegisCar(@ModelAttribute("carInfo") CarInfo carInfo)
	{
		CarInfo caInfo = new CarInfo();
		
		caInfo.setCarId(carInfo.getCarId());
		carInfo.setOwner(carInfo.getOwner());
		carInfo.setcontactNo(caInfo.getcontactNo());
		caInfo.setEmail(caInfo.getEmail());
		carInfo.setBrand(carInfo.getBrand());
		carInfo.setCarModel(carInfo.getCarModel());
		carInfo.setLicensePlate(carInfo.getLicensePlate());
		carInfo.setMakeYear(carInfo.getMakeYear());
		
		return "redirect: /RegisterCar";
	}
	

	
	

}
