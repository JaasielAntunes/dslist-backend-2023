package br.com.edu.dslistbackend2023.dto;

import br.com.edu.dslistbackend2023.entities.GameList;
import lombok.*;

@Getter
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
