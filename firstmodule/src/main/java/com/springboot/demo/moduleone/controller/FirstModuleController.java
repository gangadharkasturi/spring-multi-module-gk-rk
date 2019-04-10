package com.springboot.demo.moduleone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.moduleone.entity.MotorBike;
import com.springboot.demo.moduleone.repo.MotorBikeRepo;

@RestController
public class FirstModuleController {


    @GetMapping("/firstModule")
    public String firstModule(){
        return "First Module";
    }
    
    @Autowired
    private MotorBikeRepo repo;
    
    @GetMapping("/getBikes")
    public List<MotorBike> getAllMotorBikes() {
		return repo.getMotorBikes();
	}
    
    @PostMapping("/saveBike")
    public String saveMotorBike(@RequestBody final MotorBike mb) {
    	repo.saveMotorBike(mb);
    	return "Bike Saved";
    }
}
