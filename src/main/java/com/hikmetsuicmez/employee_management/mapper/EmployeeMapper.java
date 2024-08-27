package com.hikmetsuicmez.employee_management.mapper;

import com.hikmetsuicmez.employee_management.dto.EmployeeDTO;
import com.hikmetsuicmez.employee_management.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {


    @Mapping(source = "employee.id", target = "id")
    Employee toEmployee(EmployeeDTO employeeDTO);

    @Mapping(source = "employee.id", target = "id")
    EmployeeDTO toEmployeeDTO(Employee employee);

}
