package com.industry62.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.industry62.dto.FormCalcParametersResponse;
import com.industry62.dto.FormCalcParametersResquest;
import com.industry62.mapper.MapperInterface;
import com.industry62.repository.SportsRepository;

@Service
public class PerformCalcService {

	@Autowired
	private SportsRepository sportsRepository;
	
	@Autowired
    private MapperInterface  mapperInterface;
	
	public FormCalcParametersResponse save (FormCalcParametersResquest request) {
		
		return mapperInterface.toResponse(sportsRepository.save(mapperInterface.toEntity(request)));
		
	}

}
