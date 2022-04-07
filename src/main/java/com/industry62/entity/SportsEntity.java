package com.industry62.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "SPORTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SPORT_ID;
	
	@NotEmpty(message = "Sport is mandatory")
	@Column(name = "SPORT_DESCRIPTON")
	private String SPORT_DESCRIPTON;
	
	@Column(name = "SPORT_REWARD")
	private Double SPORT_REWARD;
	@NotEmpty(message = "Result is mandatory")
	@Column(name = "SPORT_RESULT")
	private Double SPORT_RESULT;
}
