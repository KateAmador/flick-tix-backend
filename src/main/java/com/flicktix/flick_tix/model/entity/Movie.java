package com.flicktix.flick_tix.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "peliculas")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long idMovie;

    @Column(name = "titulo")
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "genero")
    private String genre;

    @Column(name = "fecha_estreno")
    private Date releaseDate;

    @Column(name = "duracion")
    private Integer duration; // Duration in minutes
}
