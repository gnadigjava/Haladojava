package com.calculatorweb.calculatorweb;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import calculatorLogic.Logic;

@Controller
public class CalculatorController {

	private Logic calc;
	
	
	@Autowired
	public void setCalculator(Logic calc) {
		this.calc = calc;
	}

	@GetMapping(value = "/index")
	public ModelAndView getAdd() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", new DTO());
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping(value = "/index", params="sum")
	public ModelAndView postSum(@Valid DTO dto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();
	
	
		double result = calc.osztas(dto.getX(), dto.getY());
		mav.addObject("result", result);
		
		return mav;
	}
	
	
	@PostMapping(value = "/index", params="substract")
	public ModelAndView postSubstract(@Valid DTO dto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();

	
		double result = calc.kivonas(dto.getX(), dto.getY());
		mav.addObject("result", result);
		
		return mav;
	}
	
	@PostMapping(value = "/index", params="multiply")
	public ModelAndView postMultiply(@Valid DTO dto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();

		
	
		double result = calc.szorzas(dto.getX(), dto.getY());
		mav.addObject("result", result);
		
		return mav;
	}
	
	@PostMapping(value = "/index", params="divide")
	public ModelAndView postDivide(@Valid DTO dto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();

		
		
		double result = calc.osztas(dto.getX(), dto.getY());
		if(dto.getX() == 0 || dto.getY() == 0) {
			result = 0.0;
		}
		mav.addObject("result", result);
		
		return mav;
	}
	
}
