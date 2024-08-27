package com.hikmetsuicmez.employee_management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    @NotBlank(message = "Department name is required")
    private String name;
}
