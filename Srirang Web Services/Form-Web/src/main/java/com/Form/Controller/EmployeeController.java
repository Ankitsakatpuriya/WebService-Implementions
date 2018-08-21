package com.Form.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Form.Model.EmployeeModel;

@RestController
public class EmployeeController {

	
	@RequestMapping(method=RequestMethod.POST,value="/emp")
	//@ResponseBody
	public ModelAndView getEmployee(@RequestBody EmployeeModel e) {
		System.out.println(e.getId());
		return new ModelAndView("emp","EmployeeModel",e);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/emp/{id}")
	public ModelAndView setEmployee(@PathVariable int id) {
		EmployeeModel e1 = new EmployeeModel();
		e1.setId("1");
		e1.setName("Sri	");
		return new ModelAndView("emp","EmployeeModel",e1);
	}
}
