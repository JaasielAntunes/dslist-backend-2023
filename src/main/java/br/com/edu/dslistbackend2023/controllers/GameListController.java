package br.com.edu.dslistbackend2023.controllers;

import br.com.edu.dslistbackend2023.dto.GameListDTO;
import br.com.edu.dslistbackend2023.dto.GameMinDTO;
import br.com.edu.dslistbackend2023.services.GameListService;
import br.com.edu.dslistbackend2023.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping(value = "/list-all")
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
}
