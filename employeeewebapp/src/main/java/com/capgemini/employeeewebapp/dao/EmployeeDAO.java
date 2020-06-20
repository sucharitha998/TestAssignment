package com.capgemini.employeeewebapp.dao;

import java.util.List;

import com.capgemini.employeeewebapp.dto.EmployeeBean;

public interface EmployeeDAO {
	EmployeeBean login(String email, String password);
	boolean addEmployee(EmployeeBean employee);
	List<EmployeeBean> viewEmployee();
	boolean deleteEmployee(int id);
	boolean updateEmployee(EmployeeBean employee);
	public EmployeeBean getEmployeeDetailsById(int id);
}
