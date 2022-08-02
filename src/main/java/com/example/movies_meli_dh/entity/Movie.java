package com.example.movies_meli_dh.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_genre")
    @JsonIgnoreProperties("movies")
    private Genre genre;

}
