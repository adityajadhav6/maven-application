package com.pes.movies.repo;

import com.pes.movies.entity.MovieEntity;

import java.sql.*;

public class MovieRepoImpl implements MovieRepo{
    @Override
    public void saveMovie(MovieEntity entity) {
        String url="jdbc:mysql://localhost:3306/movieData";
        String userName="root";
        String psw="sambajikjadhav";

        String query="insert into movies(Name, Year, Actor, Actress, language) values(?,?,?,?,?)";
try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection=DriverManager.getConnection(url,userName,psw);
    PreparedStatement statement=connection.prepareStatement(query);
    statement.setString(1,entity.getMovieName());
    statement.setInt(2, Integer.parseInt(entity.getMovieYear()));
    statement.setString(3,entity.getMovieActor());
    statement.setString(4,entity.getMovieActress());
    statement.setString(5,entity.getMovieLanguage());
    statement.execute();

    System.out.println(entity.getMovieName() + ": Data is saved ");

    }catch (ClassNotFoundException e){
        throw new RuntimeException(e);
} catch (SQLException e) {
    throw new RuntimeException(e);
}
    }
    @Override
    public void readMovies(){
        String url="jdbc:mysql://localhost:3306/movieData";
        String userName="root";
        String psw="sambajikjadhav";

        String query="select * from movies";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,userName,psw);
            PreparedStatement statement=connection.prepareStatement(query);
            ResultSet set=statement.executeQuery();
            while(set.next()){
                System.out.println(set.getInt("id") + " "
                        +set.getString("Name") + " " + set.getString("Year")
                        + " " + set.getString("Actor") + " " + set.getString("Actress")
                        + " " + set.getString("Language"));

            }

        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}