package br.com.edu.dslistbackend2023.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class BelongingPK implements Serializable {

    @ManyToOne()
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne()
    @JoinColumn(name = "list_id")
    private GameList list;
}
