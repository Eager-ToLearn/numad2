package com.numad.numad2.Controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.numad.numad2.Model.CarInfo;
import com.numad.numad2.Repository.CarInfoRepo;
import com.numad.numad2.Service.CarInfoService;

@Controller
public class AdminController {
	
	@Autowired
	CarInfoRepo carInfoRepo;
	
	
	@Autowired
	CarInfoService carInfoService;
	
	
	@GetMapping("/admin/RegisterCar/TrackCar/{id}")
	public String trackCar(Model model)
	{
		return "TrackCar";
	}
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
	
//	@GetMapping("")
//	public String registered()
//	{
//		
//		return "Registered";
//	}
//	
//	@GetMapping("/admin/Registered/RegisterCar")
//	public String showRegistered(Model model)
//	{
//		model.addAttribute("carInfo", new CarInfo());
//		
//		return "Registered";
//	}
//	
	
	
	
	
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
//	
//	@GetMapping("/admin/Registered")
//	public String products(Model model)
//	{
//		model.addAttribute("", productService.getAllProduct());
//		return "Registered";
//	}
//	{
	
	//***Read Operation***
	@GetMapping("/admin/Registered/RegisterCar")
	public String showRegi(Model model)
	{
		model.addAttribute("carInfo", new CarInfo());
		model.addAttribute("carList", carInfoService.getAllCarInfo());
		
		return "RegisterCar";
		
	}
	
//	@GetMapping("/admin/RegisterCar")
//	public String registered(Model model)
//	{
//		model.addAttribute("carList", carInfoService.getAllCarInfo());
//		
//		return "Registered";
//	}
	
	//***Create Operation***
	@PostMapping("/admin/Registered/RegisterCar")
	
	public String regiCarFill(@ModelAttribute("carInfo") CarInfo carInfo) throws IOException
	{
		//CarInfo carInfo = new CarInfo();
		
		carInfo.setCarId(carInfo.getCarId());
		carInfo.setOwner(carInfo.getOwner());
		carInfo.setcontactNo(carInfo.getcontactNo());
		carInfo.setEmail(carInfo.getEmail());
		carInfo.setBrand(carInfo.getBrand());
		carInfo.setLicensePlate(carInfo.getLicensePlate());
		carInfo.setCarModel(carInfo.getCarModel());
		carInfo.setMakeYear(carInfo.getMakeYear());
		
		carInfoService.RegCar(carInfo);
		
		
		return "redirect:/admin/RegisterCar";
	}
	
	//***Delete Operation***
	@GetMapping("/admin/Registered/RegisterCar/delete{carId}")
	public String deleteCarInfo(@PathVariable int carId)
	{
		carInfoService.delCarInfoById(carId);
		
		return "redirect:/admin/Registered";
	}
	
//	//***Update Operation***
//	@GetMapping("/admin/Registered/RegisterCar/update{carId}")
//	public String updateCarInfo(@PathVariable int carId, Model model)
//	{
//		
//		Optional<CarInfo> carInfo = carInfoService.getCarInfoById(carId);
//		
//		CarInfo carInfo2 = new CarInfo();
//		//carInfo2.setBrand(carInfo.get().getBrand());
//		carInfo2.setCarId(carInfo.get().getCarId());
//		carInfo2.setOwner(carInfo.get().getOwner());
//		carInfo2.setcontactNo(carInfo.get().getcontactNo());
//		carInfo2.setEmail(carInfo.get().getEmail());
//		carInfo2.setBrand(carInfo.get().getBrand());
//		carInfo2.setLicensePlate(carInfo.get().getLicensePlate());
//		carInfo2.setCarModel(carInfo.get().getCarModel());
//		carInfo2.setMakeYear(carInfo.get().getMakeYear());
//		
//		model.addAttribute("carInfo", carInfo);
//		
//		return "RegisterCar";
//		
//		
//	}
	//***Update Operation***
	@GetMapping("/admin/Registered/RegisterCar/update/{carId}")
	public String updateCarInfo(@PathVariable int carId, Model model) {
	    // Retrieve the car information associated with the provided carId
	    Optional<CarInfo> optionalCarInfo = carInfoService.getCarInfoById(carId);
	    
	    // Check if the car information exists
	    if (optionalCarInfo.isPresent()) {
	        // Add the carInfo object to the model
	        model.addAttribute("carInfo", optionalCarInfo.get());
	        return "RegisterCar"; // Return the view to update the car information
	    } else {
	        // If car information does not exist, redirect to an error page or handle accordingly
	        return "error"; // You can replace "error" with the appropriate error page
	    }
	}

	@GetMapping("/admin/RegisterCar/TrackCar/{carId}")
	public String trackCar(int carId)
	{
		return "TrackCar";
	}
	
	@GetMapping("/admin/RegisterCar")
	public String registeredcCar(Model model)
	{
		model.addAttribute("Registered", carInfoService.getAllCarInfo());
	
		
		return "Registered";
	}
		
	

}
