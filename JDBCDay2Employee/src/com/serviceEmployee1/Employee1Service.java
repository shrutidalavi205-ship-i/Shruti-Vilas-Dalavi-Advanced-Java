package com.serviceEmployee1;

import com.daoEmployee1.Employee1Dao;

public class Employee1Service {

	public void insertData() throws Exception {

		Employee1Dao e = new Employee1Dao();

		e.insertData();

	}

	public void updateData() throws Exception {

		Employee1Dao e = new Employee1Dao();

		e.updateData();

	}

	public void deleteData() throws Exception {

		Employee1Dao e = new Employee1Dao();

		e.deleteData();

	}

	public void fetchAllData() throws Exception {

		Employee1Dao e = new Employee1Dao();

		e.fetchAllRecord();

	}

}
