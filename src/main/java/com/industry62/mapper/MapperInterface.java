package com.industry62.mapper;

import java.util.Random;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.industry62.dto.FormCalcParametersResponse;
import com.industry62.dto.FormCalcParametersResquest;
import com.industry62.entity.SportsEntity;

@Mapper(componentModel = "spring")
public interface MapperInterface {
	
 MapperInterface INSTANCE = Mappers.getMapper( MapperInterface.class );
 
 @Mapping(source = "sport", target = "SPORT_DESCRIPTON")  
 @Mapping(source = "result", target = "SPORT_RESULT")
 SportsEntity toEntity(FormCalcParametersResquest request );
 

 @Mapping(target = "rewards", source = "SPORT_REWARD")
 @Mapping(target = "message", constant =  " Congratulations, you earned : ")
 FormCalcParametersResponse toResponse(SportsEntity entity);
 
 
 @AfterMapping
 public default void calcRewards(@MappingTarget SportsEntity entity) {
	  Random random = new Random();
	  int maxReward = 100; 
	  entity.setSPORT_REWARD(Double.valueOf(random.nextInt(maxReward*111)));
 }

}
