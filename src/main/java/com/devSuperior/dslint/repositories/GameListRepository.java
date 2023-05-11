package com.devSuperior.dslint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dslint.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
		
}
