package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostMovie {
  private int movieId;
  private String movieName;
  private String movieGenre;

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

  public PosterData(int movieId, String movieName, String movieGenre) {
    this.movieId = movieId;
    this.movieName = movieName;
    this.movieGenre = movieGenre;
  }
}
