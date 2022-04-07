package com.industry62.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.industry62.dto.FormCalcParametersResponse;
import com.industry62.dto.FormCalcParametersResquest;
import com.industry62.service.PerformCalcService;

import io.swagger.v3.oas.annotations.media.Content;

@RestController
@RequestMapping("/")
public class PerformCalcController {
	
	@Autowired
	PerformCalcService performCalcService;
	
	final static Logger logger = LoggerFactory.getLogger(PerformCalcController.class);
	
	@RequestMapping(path = "perfomr-calc", method = RequestMethod.POST)
	public ResponseEntity<FormCalcParametersResponse> buscaPrestadores(
			@Valid @RequestBody FormCalcParametersResquest formCalcParameters) throws Exception {

		logger.info(" ### perfomr-calc SPORT  : "+formCalcParameters.getSport());
		logger.info(" ### perfomr-calc RESULT : "+formCalcParameters.getResult());
		
		
		return new ResponseEntity<FormCalcParametersResponse>(performCalcService.save(formCalcParameters), HttpStatus.OK);
	}
	
	
	 
	
}
