package fr.cinema;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// ## 5. Récupérer la ligne d'un seul film
// Améliorer la classe `MoviesDatabase` pour rajouter une méthode `String getMovieInfo(String movieName)`.

// Cette étape est plus compliquée, il faut parcourir le contenu du fichier, ligne par ligne, pour chercher le nom du film passé en paramètre de la méthode, puis retourner uniquement la ligne correspondant au bon film.

// Cette étape est validée lorsque le programme, au lieu d'afficher tout le fichier dans la console, n'affiche que la ligne correspondant au nom de film entré par l'utilisateur

// Aide : 
// * https://www.delftstack.com/fr/howto/java/how-to-read-a-large-text-file-line-by-line-in-java/
// * https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html#contains(java.lang.CharSequence)
// * https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html#indexOf(java.lang.String)


class MoviesDatabase {
    private static MoviesDatabase instance = null;

    private MoviesDatabase() {
    }

    public static MoviesDatabase getInstance() {
        if (instance == null) {
            instance = new MoviesDatabase();
        }
        return instance;
    }

    public List<String> readAllMovies() {
        Path path = Paths.get("../resources/movies.csv");
        List<String> lines ;
        try {
         lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            lines = null;
        }
        return lines;
    }

    public String getMovieInfo(String movieName) {
       List<String> lines = readAllMovies();
         String movieInfo = "";
        for (String line : lines) {
            if (line.toLowerCase().contains(movieName.toLowerCase())) {
                movieInfo = line;      
            }
    }
            return movieInfo;
}
}

// ## 4. Accéder au fichier des films
// Créer une nouvelle classe `MoviesDatabase` qui contient une méthode `String
// readAllMovies()`, permettant de lire le contenu du fichier des films.

// Le main va créer une instance (new) de la classe `MoviesDatabase`, et appeler
// la méthode readAllMovies pour afficher le contenu du fichier dans la console.

// Cette étape est validée lorsque le programme, en plus de lire le nom du film,
// affiche le contenu du fichier.

// https://pieces-of-code.com/guide/howto/java-files-read-write.html#fichiers-textes
