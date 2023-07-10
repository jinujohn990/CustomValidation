package com.jinu.dto;

import javax.validation.constraints.NotBlank;

import com.jinu.validation.DesignationValidation;
import com.jinu.validation.Gmail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
	private int employeeId;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@Gmail
	private String gmail;
	@DesignationValidation
	private String designation;
}
