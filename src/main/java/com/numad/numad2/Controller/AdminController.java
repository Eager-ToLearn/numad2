package com.numad.numad2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.numad.numad2.Model.CarInfo;
import com.numad.numad2.Repository.CarInfoRepo;

public class AdminController {
	
	@Autowired
	CarInfoRepo carInfoRepo;
//	
////	@GetMapping("adminHome/RegisterCar")
////	public String adminHome()
////	{
////		
////		return "RegisterCar";
////		
////	}
//	
//	@GetMapping("/admin/RegisterCar")
//	public String getRegPage()
//	{
//		
//		return "RegisterCar";
//	}
	
	@PostMapping("/admin/Registered/RegisterCar")
	public String regCar(@ModelAttribute("carInfo")CarInfo carInfo)
	{
		
		carInfoRepo.save(carInfo);
		
		return "redirect:/admin/RegisterCar";
		
		
	}
//	
//	@GetMapping("/admin/Registered")
//	public String products(Model model)
//	{
//		model.addAttribute("", productService.getAllProduct());
//		return "Registered";
//	}
//	{
	
	
		
		
	

}
