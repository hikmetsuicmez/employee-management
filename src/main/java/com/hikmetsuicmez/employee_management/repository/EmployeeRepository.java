package com.hikmetsuicmez.employee_management.repository;

import com.hikmetsuicmez.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
