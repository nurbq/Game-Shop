package com.example.gameshop.service;


import com.example.gameshop.model.Game;
import com.example.gameshop.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getAllGames(){
        return (List<Game>) gameRepository.findAll();
    }

    public Game getGameById(Long id){
        return gameRepository.findById(id).orElse(null);
    }

    public Game addGame(Game game){
        return gameRepository.save(game);
    }

    public Game updateGame(Game game){
        return gameRepository.save(game);
    }

    public void deleteGame(Long id){
        gameRepository.deleteById(id);
    }

    public List<Game> findByName(String name) {
        return gameRepository.findByName(name);
    }

    public List<Game> findGamesByPriceBetween(Double minPrice, Double maxPrice) {
        return gameRepository.findByPriceBetween(minPrice, maxPrice);
    }

}
