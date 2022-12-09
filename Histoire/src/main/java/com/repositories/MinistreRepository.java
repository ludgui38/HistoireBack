package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Ministre;

@Repository
public interface MinistreRepository extends JpaRepository<Ministre, Long> {
	
}
