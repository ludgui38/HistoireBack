package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Monument;

@Repository
public interface MonumentRepository extends JpaRepository<Monument, Long> {
	
}
