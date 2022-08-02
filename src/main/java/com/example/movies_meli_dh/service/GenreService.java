package com.example.movies_meli_dh.service;

import com.example.movies_meli_dh.entity.Genre;
import com.example.movies_meli_dh.entity.Movie;
import com.example.movies_meli_dh.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Transactional
    public Genre salvarGenre(Genre genre) {
//        for (Acthor a : movie.getActhors()) {
//            Optional<Acthor> acthor = acthorRepository.findByDrt(a.getDrt());
//            if (acthor.isPresent()) {
//                a.setId(acthor.get().getId());
//            }
//        }
        return genreRepository.save(genre);
    }

    public List<Genre> buscarGenres() {
        return genreRepository.findAll();
    }

}
