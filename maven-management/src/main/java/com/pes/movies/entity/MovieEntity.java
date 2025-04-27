package com.pes.movies.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieEntity {
    private int movieId;
    private String movieName;
    private String movieYear;
    private String movieActor;
    private String movieActress;
    private String movieLanguage;

}
