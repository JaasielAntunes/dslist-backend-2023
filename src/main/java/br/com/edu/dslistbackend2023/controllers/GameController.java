package br.com.edu.dslistbackend2023.controllers;

import br.com.edu.dslistbackend2023.dto.GameDTO;
import br.com.edu.dslistbackend2023.dto.GameMinDTO;
import br.com.edu.dslistbackend2023.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/list-all")
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") Long id) {

        Optional<GameDTO> game = gameService.findById(id);
        return game.<ResponseEntity<Object>>map(result -> ResponseEntity.status(HttpStatus.OK)
                .body(result)).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Jogo não encontrado!"));
    }
}
