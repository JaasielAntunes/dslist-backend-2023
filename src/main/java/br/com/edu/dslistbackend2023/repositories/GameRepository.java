package br.com.edu.dslistbackend2023.repositories;

import br.com.edu.dslistbackend2023.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
