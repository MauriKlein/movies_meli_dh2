package com.example.movies_meli_dh.service;

import com.example.movies_meli_dh.entity.Genre;
import com.example.movies_meli_dh.entity.Movie;
import com.example.movies_meli_dh.repository.GenreRepository;
import com.example.movies_meli_dh.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private GenreRepository genreRepository;

    @Transactional
    public Movie salvarMovie(Movie movie) {
        Optional<Genre> genre = genreRepository.findByName(movie.getGenre().getName());
        if(genre.isPresent()){
            movie.setGenre(genre.get());
        }

        return movieRepository.save(movie);
    }

    public List<Movie> buscarMovies() {
        return movieRepository.findAll();
    }


}
