package com.industry62.dto;

import java.io.Serializable;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class FormCalcParametersResponse implements Serializable {

	@Transient
	private static final long serialVersionUID = 6439341501739383857L;
	
	private String message;
	private Double rewards;
	
}
