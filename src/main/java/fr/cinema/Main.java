package fr.cinema;
import java.io.Console;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue cher client, quel film voulez vous voir ?");

        Console console = System.console();
        String userInput = console.readLine("Quel film voulez vous voir ? ");
        System.out.println("Recherche du film" + userInput);

        MoviesDatabase moviesDatabase = MoviesDatabase.getInstance();
        // List<String> movies = moviesDatabase.readAllMovies();
        // for (String movie : movies) {
        //     System.out.println(movie);
        // }
        System.out.println("///////////////");
        System.out.println(moviesDatabase.getMovieInfo(userInput));
        
    }
}
