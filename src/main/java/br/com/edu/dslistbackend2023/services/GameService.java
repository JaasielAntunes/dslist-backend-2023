package br.com.edu.dslistbackend2023.services;

import br.com.edu.dslistbackend2023.dto.GameDTO;
import br.com.edu.dslistbackend2023.dto.GameMinDTO;
import br.com.edu.dslistbackend2023.entities.Game;
import br.com.edu.dslistbackend2023.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public Optional<GameDTO> findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return Optional.of(new GameDTO(result));
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
