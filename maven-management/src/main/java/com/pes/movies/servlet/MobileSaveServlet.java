package com.pes.movies.servlet;

import com.pes.movies.entity.MovieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/save")
public class MobileSaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        MovieEntity entity = new MovieEntity();
        entity.setMovieName(req.getParameter("Name"));
        entity.setMovieYear(req.getParameter("Year"));
        entity.setMovieActor(req.getParameter("Actor"));
        entity.setMovieActress(req.getParameter("Actress"));
        entity.setMovieLanguage(req.getParameter("Language"));

        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(entity);
        System.out.println("servlet :"+entity);

        PrintWriter respWriter = resp.getWriter();
        respWriter.print(entity.getMovieName() +": Movie Saved...!");
    }
}
