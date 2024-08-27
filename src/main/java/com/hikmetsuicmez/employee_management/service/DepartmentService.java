package com.hikmetsuicmez.employee_management.service;

import com.hikmetsuicmez.employee_management.dto.DepartmentDTO;
import com.hikmetsuicmez.employee_management.entity.Department;
import com.hikmetsuicmez.employee_management.mapper.DepartmentMapper;
import com.hikmetsuicmez.employee_management.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    public DepartmentService(DepartmentRepository departmentRepository, DepartmentMapper departmentMapper) {
        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }

    public List<DepartmentDTO> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();
        return departments.stream().map(departmentMapper::toDepartmentDTO)
                .toList();
    }

    public Optional<DepartmentDTO> getDepartmentById(Long id) {
        return departmentRepository.findById(id).map(departmentMapper::toDepartmentDTO);
    }

    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO) {
        Department department = departmentMapper.toDepartment(departmentDTO);
        departmentRepository.save(department);
        return departmentMapper.toDepartmentDTO(department);

    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

}
