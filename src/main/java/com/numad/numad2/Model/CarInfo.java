package com.numad.numad2.Model;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Car Info")
public class CarInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carId;
	
	@Column(nullable = false)
	private String owner;
	
	@Column(nullable = false)
	private String contactNo;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String brand;
	
	@Column(nullable = false)
	private String carModel;
	
	@Column(nullable = false, unique = true)
	private String licensePlate;
	private Year makeYear;
	
	@Column(nullable = false, unique = true)
	private String ipAddress;

	public CarInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarInfo(int carId, String owner, String contactNo, String email, String brand, String carModel,
			String licensePlate, Year makeYear, String ipAddress) {
		super();
		this.carId = carId;
		this.owner = owner;
		this.contactNo = contactNo;
		this.email = email;
		this.brand = brand;
		this.carModel = carModel;
		this.licensePlate = licensePlate;
		this.makeYear = makeYear;
		this.ipAddress = ipAddress;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Year getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(Year makeYear) {
		this.makeYear = makeYear;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "CarInfo [carId=" + carId + ", owner=" + owner + ", contactNo=" + contactNo + ", email=" + email
				+ ", brand=" + brand + ", carModel=" + carModel + ", licensePlate=" + licensePlate + ", makeYear="
				+ makeYear + ", ipAddress=" + ipAddress + "]";
	}
	
	
	
	
	

}
