package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.ChefEtat;

@Repository
public interface ChefEtatRepository extends JpaRepository<ChefEtat, Long> {
	
}
