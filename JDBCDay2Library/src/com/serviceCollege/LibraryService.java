package com.serviceCollege;

import com.daocollege.CollegeDao;

public class LibraryService {

	public void insertData() throws Exception {

		CollegeDao e = new CollegeDao();

		e.insertData();

	}

	public void updateData() throws Exception {

		CollegeDao e = new CollegeDao();

		e.updateData();

	}

	public void deleteData() throws Exception {

		CollegeDao e = new CollegeDao();

		e.deleteData();

	}

	public void fetchAllData() throws Exception {

		CollegeDao e = new CollegeDao();

		e.fetchAllRecord();

	}

}
