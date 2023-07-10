package com.jinu.controller;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinu.dto.EmployeeDTO;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@PostMapping("/add")
	public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody @Valid EmployeeDTO employee) {
		employee.setEmployeeId(new Random().nextInt());
		return ResponseEntity.ok(employee);
	}

}
