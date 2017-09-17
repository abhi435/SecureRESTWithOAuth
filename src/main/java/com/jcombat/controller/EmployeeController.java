package com.jcombat.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jcombat.bean.Employee;

@RestController
@RequestMapping(value = "/api/Employee")
public class EmployeeController {
	
	/*
	 * http://localhost:8080/SecureRESTWithOAuth/oauth/token?grant_type=password&client_id=fbApp&client_secret=fbApp&username=admin&password=123
	 * http://localhost:8080/SecureRESTWithOAuth/api/Employee/abhimanyu?access_token=d941ffc9-0dc4-4601-aca9-b4b56d48b321
	 */
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public Employee process(
			@PathVariable("name") String name,
			@RequestParam(value = "empId", required = false, defaultValue = "00000") final String id) {
		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setName(name);
		return employee;
	}
}