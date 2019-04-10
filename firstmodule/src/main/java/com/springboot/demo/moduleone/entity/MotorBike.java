package com.springboot.demo.moduleone.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Gangadhar, Kasturi
 *
 */
@Entity
@Table
public class MotorBike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeId;


	private String model;

	

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
}