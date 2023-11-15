package br.com.edu.dslistbackend2023.repositories;

import br.com.edu.dslistbackend2023.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
