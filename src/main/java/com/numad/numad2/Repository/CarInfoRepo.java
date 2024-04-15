package com.numad.numad2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numad.numad2.Model.CarInfo;

public interface CarInfoRepo extends JpaRepository<CarInfo, Integer> {

}
