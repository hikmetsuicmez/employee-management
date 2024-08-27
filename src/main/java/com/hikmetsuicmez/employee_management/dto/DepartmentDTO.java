package com.hikmetsuicmez.employee_management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DepartmentDTO {

    @NotBlank(message = "Department name is required")
    private String name;
}
