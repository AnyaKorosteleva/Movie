package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PostMovie;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PostTest {

    PostMovie movieToAdd1 = new PostMovie(1, "title1", "genre1");
    PostMovie movieToAdd2 = new PostMovie(2, "title2", "genre2");
    PostMovie movieToAdd3 = new PostMovie(3, "title3", "genre3");
    PostMovie movieToAdd4 = new PostMovie(4, "title4", "genre4");
    PostMovie movieToAdd5 = new PostMovie(5, "title5", "genre5");
    PostMovie movieToAdd6 = new PostMovie(6, "title6", "genre6");
    PostMovie movieToAdd7 = new PostMovie(7, "title7", "genre7");
    PostMovie movieToAdd8 = new PostMovie(8, "title8", "genre8");
    PostMovie movieToAdd9 = new PostMovie(9, "title9", "genre9");
    PostMovie movieToAdd10 = new PostMovie(10, "title10", "genre10");
    PostMovie movieToAdd11 = new PostMovie(11, "title11", "genre11");


    void setup(MovieManager manager) {
        manager.addMovie(movieToAdd1);
        manager.addMovie(movieToAdd2);
        manager.addMovie(movieToAdd3);
        manager.addMovie(movieToAdd4);
        manager.addMovie(movieToAdd5);
        manager.addMovie(movieToAdd6);
        manager.addMovie(movieToAdd7);
        manager.addMovie(movieToAdd8);
        manager.addMovie(movieToAdd9);


    }


    @Test
    public void shouldAddMoviesEqualManagerLength() {
        MovieManager manager = new MovieManager();

        manager.addMovie(movieToAdd10);
        PostMovie[] actual = manager.getAllMovies();
        PostMovie[] expected = new PostMovie[]{movieToAdd10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMoviesShowFromLastToFirst() {
        MovieManager manager = new MovieManager();

        setup(manager);
        PostMovie[] actual = manager.getAllMovies();
        PostMovie[] expected = new PostMovie[]{movieToAdd9, movieToAdd8, movieToAdd7,
                movieToAdd6, movieToAdd5, movieToAdd4, movieToAdd3, movieToAdd2, movieToAdd1};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowMoviesWithLimit() {

        MovieManager manager = new MovieManager(5);
        setup(manager);
        PostMovie[] actual = manager.getAllMovies();
        PostMovie[] expected = new PostMovie[]{movieToAdd9, movieToAdd8, movieToAdd7,
                movieToAdd6, movieToAdd5};
        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldDefaultValue() {

        MovieManager manager = new MovieManager();
        setup(manager);
        manager.addMovie(movieToAdd10);
        manager.addMovie(movieToAdd11);
        PostMovie[] actual = manager.getAllMovies();
        PostMovie[] expected = new PostMovie[]{movieToAdd11, movieToAdd10, movieToAdd9,
                movieToAdd8, movieToAdd7, movieToAdd6, movieToAdd5, movieToAdd4, movieToAdd3, movieToAdd2};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowMoviesWithZeroNumber() {
        MovieManager manager = new MovieManager(0);
        setup(manager);
        PostMovie[] actual = manager.getAllMovies();
        PostMovie[] expected = new PostMovie[]{};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowMoviesWithNegativeNumber() {
        MovieManager manager = new MovieManager(-2);
        setup(manager);
        PostMovie[] actual = manager.getAllMovies();
        PostMovie[] expected = new PostMovie[]{movieToAdd9, movieToAdd8, movieToAdd7,
                movieToAdd6, movieToAdd5, movieToAdd4, movieToAdd3, movieToAdd2, movieToAdd1};
        assertArrayEquals(expected, actual);

    }
}