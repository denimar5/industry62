package com.industry62.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.industry62.entity.SportsEntity;

@Repository
public interface SportsRepository extends JpaRepository<SportsEntity, Integer > {
	
}
