package com.pes.movies;

import com.pes.movies.entity.MovieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoImpl;

public class MovieRunner {
    public static void main(String[] args) {
        MovieEntity movieEntity=new MovieEntity();
        //movieEntity.setMovieId(1);
        movieEntity.setMovieName("Chhaava");
        movieEntity.setMovieYear("2025");
        movieEntity.setMovieActor("Vicky");
        movieEntity.setMovieActress("Rashmika");
        movieEntity.setMovieLanguage("Hindi");

        //Second Movie
        //movieEntity.setMovieId(2);
        movieEntity.setMovieName("Oppenhiemer");
        movieEntity.setMovieYear("2024");
        movieEntity.setMovieActor("Cilian Murphy");
        movieEntity.setMovieActress("xyz");
        movieEntity.setMovieLanguage("English");

        //Third Movie
       // movieEntity.setMovieId(3);
        movieEntity.setMovieName("Night Crawlers");
        movieEntity.setMovieYear("2022");
        movieEntity.setMovieActor("Jake Gyllenhall");
        movieEntity.setMovieActress("abc");
        movieEntity.setMovieLanguage("English");

        //Fourth Movie
       // movieEntity.setMovieId(4);
        movieEntity.setMovieName("Wolves of the Wallstreet");
        movieEntity.setMovieYear("2004");
        movieEntity.setMovieActor("Leonardo di caprio");
        movieEntity.setMovieActress("stu");
        movieEntity.setMovieLanguage("English");

      //Fifth Movie
        //movieEntity.setMovieId();
        movieEntity.setMovieName("American Psycho");
        movieEntity.setMovieYear("2004");
        movieEntity.setMovieActor("Patrich Bateman");
        movieEntity.setMovieActress("Emily");
        movieEntity.setMovieLanguage("English");
        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(movieEntity);

    }
}
