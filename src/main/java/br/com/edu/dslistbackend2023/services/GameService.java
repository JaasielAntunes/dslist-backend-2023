package br.com.edu.dslistbackend2023.services;

import br.com.edu.dslistbackend2023.dto.GameMinDTO;
import br.com.edu.dslistbackend2023.entities.Game;
import br.com.edu.dslistbackend2023.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
