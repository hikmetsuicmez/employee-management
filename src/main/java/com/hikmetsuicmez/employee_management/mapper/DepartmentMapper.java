package com.hikmetsuicmez.employee_management.mapper;

import com.hikmetsuicmez.employee_management.dto.DepartmentDTO;
import com.hikmetsuicmez.employee_management.entity.Department;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepartmentMapper {


    public Department toDepartment(DepartmentDTO departmentDTO) {
        return Department.builder()
                .name(departmentDTO.getName())
                .build();
    }

    public DepartmentDTO toDepartmentDTO(Department department) {
        return DepartmentDTO.builder()
                .name(department.getName())
                .build();
    }


}
