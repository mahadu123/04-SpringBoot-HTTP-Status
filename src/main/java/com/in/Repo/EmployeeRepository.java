package com.in.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
