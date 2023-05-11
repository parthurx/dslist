package com.devSuperior.dslint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dslint.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
		
}
