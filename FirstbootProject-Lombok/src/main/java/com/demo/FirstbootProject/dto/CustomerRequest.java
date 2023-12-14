package com.demo.FirstbootProject.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO-Data Transfer Object
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
	private Integer id;
	@NotNull(message = "username shouldn't be null")
	private String name;
	@Min(10)
	@Max(50)
	private String address;
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private Long mobileNo;
}
