package br.com.edu.dslistbackend2023.services;

import br.com.edu.dslistbackend2023.dto.GameDTO;
import br.com.edu.dslistbackend2023.dto.GameMinDTO;
import br.com.edu.dslistbackend2023.entities.Game;
import br.com.edu.dslistbackend2023.projections.GameMinProjection;
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
        Optional<Game> game = gameRepository.findById(id);

        if (game.isEmpty()) {
            return Optional.empty();
        }

        return game.map(GameDTO::new);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
