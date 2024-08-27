package com.hikmetsuicmez.employee_management.mapper;

import com.hikmetsuicmez.employee_management.dto.EmployeeDTO;
import com.hikmetsuicmez.employee_management.entity.Employee;
import com.hikmetsuicmez.employee_management.repository.DepartmentRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeMapper {

    private final DepartmentRepository departmentRepository;

    public EmployeeMapper(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Employee toEmployee(EmployeeDTO employeeDTO) {
        return Employee.builder()
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .department(departmentRepository.findById(employeeDTO.getDepartmentId()).orElse(null))
                .build();
    }

    public EmployeeDTO toEmployeeDTO(Employee employee) {
            return  EmployeeDTO.builder()
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .departmentId(employee.getDepartment().getId())
                .build();
    }
}
