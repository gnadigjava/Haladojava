package com.calculatorweb.calculatorweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import calculatorLogic.Logic;

@Configuration
public class DependencyConfig {

	@Bean
	public Logic calculate() {
		return new Logic();
	}

}