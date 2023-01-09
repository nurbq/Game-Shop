package com.example.gameshop.repository;

import com.example.gameshop.model.Game;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GameRepository extends CrudRepository<Game, Long> {

    List<Game> findByName(String name);

    List<Game> findByPriceBetween(Double minPrice, Double maxPrice);


}
