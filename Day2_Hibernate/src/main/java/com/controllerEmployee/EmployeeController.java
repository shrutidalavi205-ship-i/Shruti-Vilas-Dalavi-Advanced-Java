package com.controllerEmployee;

import com.serviceEmployee.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();

		service.insertData();
//		service.deleteData();
//		service.updateData();
//		service.getSingleRecord();

	}
}