package com.service;

import com.dao.EmployeeDao;
import com.pojo.PojoClass;

public class EmployeeService {

	public void insertData1(int id,String name,String salary,String city,String jDate,String mobNo,String email,String dept,String position,String experience) throws Exception {

		PojoClass p = new PojoClass(id,name,salary,city,jDate,mobNo,email,dept,position,experience);
		EmployeeDao c = new EmployeeDao();
		c.insertData1(p);

	}

	public void updateData1(int id,String salary) throws Exception {
	    PojoClass p = new PojoClass();
	    p.setId(id);
	    p.setSalary(salary);
	    new EmployeeDao().updateDate1(p);
	}

	public void deleteData1(int id) throws Exception {
	    PojoClass p = new PojoClass();
	    p.setId(id);

	    new EmployeeDao().deleteData1(p);
	}


	public void fetchAllRecord() throws Exception {
	    EmployeeDao dao = new EmployeeDao();
	    dao.fetchAllRecord(new PojoClass());
	}

	public void dropDable(PojoClass p) throws Exception {

		EmployeeDao c = new EmployeeDao();
		c.dropTable(p);

	}

	
	
	
		
	}	
	
	

