package ru.netology.domain;

public class PostMovie {
    private int movieId;
    private String movieName;
    private String movieGenre;

    public PostMovie(int movieId, String movieName, String movieGenre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
