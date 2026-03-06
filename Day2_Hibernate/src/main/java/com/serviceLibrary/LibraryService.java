package com.serviceLibrary;

import com.daoLibrary.LibraryDao;

public class LibraryService {

	public void insertData() {
		LibraryDao dao = new LibraryDao();
		dao.insertData();

	}

	public void deleteData() {
		LibraryDao dao = new LibraryDao();
		dao.deleteData();
	}

	public void updateData() {
		LibraryDao dao = new LibraryDao();
		dao.updateData();
	}

	public void getSingleRecord() {
		LibraryDao dao = new LibraryDao();
		dao.getSingleRecord();

	}

}