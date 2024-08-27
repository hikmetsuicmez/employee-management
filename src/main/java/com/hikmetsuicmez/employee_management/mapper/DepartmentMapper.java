package com.hikmetsuicmez.employee_management.mapper;

import com.hikmetsuicmez.employee_management.dto.DepartmentDTO;
import com.hikmetsuicmez.employee_management.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    @Mapping(source = "department.id", target = "id")
    Department toDepartment(DepartmentDTO departmentDTO);

    @Mapping(source = "department.id", target = "id")
    DepartmentDTO toDepartmentDTO(Department department);


}
