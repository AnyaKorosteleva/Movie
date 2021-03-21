package ru.netology.manager;

import ru.netology.domain.PostMovie;

public class MovieManager {
    private PostMovie[] movies = new PostMovie[0];


    int defaultNumberToShow = 10;

    public MovieManager(int number) {
        if (number > 0) {
            defaultNumberToShow = number;
        }
    }

    public MovieManager() {
    }

    public void addMovie(PostMovie poster) {
        int length = movies.length + 1;
        PostMovie[] tmp = new PostMovie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        movies = tmp;
    }

    public PostMovie[] getAllMovies() {
        int lenght;
        if (defaultNumberToShow <= movies.length) {
            lenght = defaultNumberToShow;
        } else {
            lenght = movies.length;
        }
        PostMovie[] result = new PostMovie[lenght];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
