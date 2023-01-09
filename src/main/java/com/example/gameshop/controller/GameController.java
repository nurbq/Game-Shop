package com.example.gameshop.controller;

import com.example.gameshop.model.Game;
import com.example.gameshop.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) {
        return gameService.getGameById(id);
    }

    @GetMapping("/name/{name}")
    public List<Game> getGameByName(@PathVariable String name) {
        return gameService.findByName(name);
    }

    @PostMapping
    public Game addGame(@RequestBody Game game){
        return gameService.addGame(game);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game game){
        game.setId(id);
        return gameService.updateGame(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id){
        gameService.deleteGame(id);
    }
}
