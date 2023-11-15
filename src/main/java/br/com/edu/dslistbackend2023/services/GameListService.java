package br.com.edu.dslistbackend2023.services;

import br.com.edu.dslistbackend2023.dto.GameListDTO;
import br.com.edu.dslistbackend2023.entities.GameList;
import br.com.edu.dslistbackend2023.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
