package com.emp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee, BindingResult bindingresult,
			HttpServletRequest request) {
		service.saveEmployee(employee);
		return new ModelAndView("index", "employee", new Employee());
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		// System.out.println("aaaaaaaaaaaaaaa");
		return service.getAll();
	}

	@GetMapping("/getAllDepartment")
	public String getAllDept() {
		return restTemplate.exchange("http://localhost:8081/getAllDepartments", HttpMethod.GET, null, String.class)
				.getBody();
	}

}
