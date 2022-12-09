package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Roi;

@Repository
public interface RoiRepository extends JpaRepository<Roi, Long> {
	
}
