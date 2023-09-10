package com.in.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.Repo.EmployeeRepository;
import com.in.model.Employee;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	public Object insertData(Employee employee) {
	if (employee.getEid()!=0&&employee.getEnmae()!=null&&employee.getAddr()!=null&&employee.getExperience()!=0&&employee.getYearOfJoining()!=0) {
		return repo.save(employee);
	}
		else {
			return "Employee Details Already Found"; 
		}
	}
	public Employee updateData(Employee employee) {
		if (employee.getEid()!=0&&employee.getEnmae()!=null&&employee.getAddr()!=null&&employee.getExperience()!=0&&employee.getYearOfJoining()!=0) {
		return repo.save(employee);
		}
		else {
			return null;
		}
	}

}
