package com.hikmetsuicmez.employee_management.service;

import com.hikmetsuicmez.employee_management.dto.EmployeeDTO;
import com.hikmetsuicmez.employee_management.entity.Employee;
import com.hikmetsuicmez.employee_management.mapper.EmployeeMapper;
import com.hikmetsuicmez.employee_management.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public List<EmployeeDTO> getAllEmployees() {
        log.info("getAllEmployees");
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employeeMapper::toEmployeeDTO).toList();
    }

    public Optional<EmployeeDTO> getEmployeeById(Long id) {
        log.info("getEmployeeById");
        log.debug("Attempting to retrieve employee with id: {}", id);
        return employeeRepository.findById(id).map(employeeMapper::toEmployeeDTO);
    }

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        log.info("saveEmployee");
        Employee employee = employeeMapper.toEmployee(employeeDTO);
        employeeRepository.save(employee);
        return employeeMapper.toEmployeeDTO(employee);
    }

    public void deleteEmployee(Long id) {
        log.info("deleteEmployee");
        employeeRepository.deleteById(id);
    }

}
