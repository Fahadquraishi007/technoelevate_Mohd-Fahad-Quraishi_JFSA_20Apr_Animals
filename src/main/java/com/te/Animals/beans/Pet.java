package com.te.Animals.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.Animals.interfaces.Animal;

import lombok.Data;

@Data
public class Pet implements Serializable{

	private String name;
	
	@Autowired
	@Qualifier("panda")
	private Animal animal;
}