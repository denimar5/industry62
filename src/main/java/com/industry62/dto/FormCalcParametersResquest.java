package com.industry62.dto;

import  javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FormCalcParametersResquest {

	@NotEmpty(message = "Sport is mandatory")
	private String sport;
	@NotEmpty(message = "Result is mandatory")
	private Double result;
	
}
