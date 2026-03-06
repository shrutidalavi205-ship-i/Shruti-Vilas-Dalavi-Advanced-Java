package com.controllerLibrary;

import com.serviceLibrary.LibraryService;


public class LibraryController {

	public static void main(String[] args) {

		LibraryService service = new LibraryService();

		service.insertData();
//		service.deleteData();
//		service.updateData();
//		service.getSingleRecord();

	}
}