package com.example.movies_meli_dh.controller;

import com.example.movies_meli_dh.entity.Genre;
import com.example.movies_meli_dh.entity.Movie;
import com.example.movies_meli_dh.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/genre")
public class GenreController {

    @Autowired
    private GenreService genreService;


    @PostMapping()
    public ResponseEntity<Genre> createMovie(@RequestBody Genre genre) {
        return ResponseEntity.status(HttpStatus.CREATED).body(genreService.salvarGenre(genre));
    }

    @GetMapping("all")
    public ResponseEntity<List<Genre>> findAllMovies(){
        return ResponseEntity.ok(genreService.buscarGenres());

    }
}
