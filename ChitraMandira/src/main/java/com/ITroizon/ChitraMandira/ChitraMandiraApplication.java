package com.ITroizon.ChitraMandira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
@SpringBootApplication
@ComponentScan(basePackages = {"com.ITorizon.ChitraMandira.dto","com.ITorizon.ChitraMandira.controller","com.ITorizon.ChitraMandira.services","com.ITorizon.ChitraMandira.repo"})
@EntityScan(basePackages = {"com.ITorizon.ChitraMandira.dto"})
public class ChitraMandiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChitraMandiraApplication.class, args);
	}

}
