package com.numad.numad2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numad.numad2.Model.CarInfo;
import com.numad.numad2.Model.User;
import com.numad.numad2.Repository.CarInfoRepo;

@Controller
//@RestController
public class HomeController {
	
	@Autowired
	CarInfoRepo carInfoRepo;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/adminHome")
	public String getAdminHome()
	{
		return "adminHome";
	}
	
	@GetMapping("/admin/login")
	public String getAdminLogin(Model model)
	{
		model.addAttribute("user", new User());
		return "AdminLogin";
	}
	
	@GetMapping("/admin/RegisterCar")
	public String showRegPage(Model model)
	{
		//model.addAttribute("carInfo", new CarInfo());
		
		return "Registered";
	}
	
//	@GetMapping("/admin/Registered/RegisterCar")
//	public String showRegi(Model model)
//	{
//		model.addAttribute("carInfo", new CarInfo());
//		
//		return "RegisterCar";
//		
//	}
	
//	@PostMapping("/admin/Registered/RegisterCar")
//	public String regCar(@ModelAttribute("carInfo")CarInfo carInfo)
//	{
//		
//		carInfoRepo.save(carInfo);
//		
//		return "redirect:/admin/RegisterCar";
//		
//		
//	}
			

}
