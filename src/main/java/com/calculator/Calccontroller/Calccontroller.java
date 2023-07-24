package com.calculator.Calccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calccontroller {
	
    @GetMapping("/calculator")
    public ModelAndView showCalculatorPage() {
        ModelAndView modelAndView = new ModelAndView("Calculator");
      
        return modelAndView;
    }
	
	 @PostMapping("/calculator")
	    public ModelAndView calculate(
	            @RequestParam("operation") String operation,
	            @RequestParam("n1") int n1,
	            @RequestParam("n2") int n2) {

	        int result = 0;
	        
	        try {
	        if(operation.equals("add"))
	        {
	       
	                result = n1 + n2;
	        }
	                
	        else if(operation.equals("subtract"))
	        {
	        result = n1 - n2;
	        }    
	        
	        else if(operation.equals("multiply"))
	        {

	        result = n1 * n2;
	        }
	        
	        else if(operation.equals("divide"))
	        {

	       if (n2 == 0) {
	      
	    	   throw new IllegalArgumentException("Division by zero is not allowed.");
	            }
	           result = n1 / n2;
	              
	        }
	        }
	        catch(IllegalArgumentException e)
	        {
	        	ModelAndView errorModelAndView=new ModelAndView("Calculator");
	        	errorModelAndView.addObject("error",e.getMessage());
	        	return errorModelAndView;
	        	
	        }
	        ModelAndView modelandview = new ModelAndView("Calculator");
	        modelandview.addObject("result", result);
	        return modelandview;
	    }
	

		}


