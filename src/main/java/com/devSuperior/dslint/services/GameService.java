package com.devSuperior.dslint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devSuperior.dslint.dto.GameMinDTO;
import com.devSuperior.dslint.entities.Game;
import com.devSuperior.dslint.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;

	}

}