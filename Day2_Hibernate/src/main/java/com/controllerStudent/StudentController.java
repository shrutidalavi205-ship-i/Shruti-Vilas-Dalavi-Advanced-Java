package com.controllerStudent;

import com.serviceStudent.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService service = new StudentService();

		service.insertData();
//		service.deleteData();
//		service.updateData();
//		service.getSingleRecord();

	}
}