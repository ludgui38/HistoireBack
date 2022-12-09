package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {
	
}
