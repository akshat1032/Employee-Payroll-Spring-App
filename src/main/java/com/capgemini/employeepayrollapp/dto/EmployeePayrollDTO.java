package com.capgemini.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

	@Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{2,}$", message = "Employee name invalid")
	public String name;
	
	@Min(value=500, message="Min wage should be more than 500")
	public long salary;

	public EmployeePayrollDTO(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "name: " + name + " salary: " + salary;
	}

}
