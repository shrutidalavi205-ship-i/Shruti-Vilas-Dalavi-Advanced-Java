package com.serviceStudent;

import com.daoStudent.StudentDao;

public class StudentService {

	public void insertData() {
		StudentDao dao = new StudentDao();
		dao.insertData();

	}

	public void deleteData() {
		StudentDao dao = new StudentDao();
		dao.deleteData();
	}

	public void updateData() {
		StudentDao dao = new StudentDao();
		dao.updateData();
	}

	public void getSingleRecord() {
		StudentDao dao = new StudentDao();
		dao.getSingleRecord();

	}

}