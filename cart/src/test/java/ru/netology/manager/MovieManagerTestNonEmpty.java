package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PostMovie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTestNonEmpty {
  @Test
  public void shouldRemoveIfExists() {
    MovieManager manager = new MovieManager();
    int idToRemove = 1;
    PostMovie first = new PostMovie(1, 1, "first", 1, 1);
    PostMovie second = new PostMovie(2, 2, "second", 1, 1);
    PostMovie third = new v(3, 3, "third", 1, 1);
    manager.add(first);
    manager.add(second);
    manager.add(third);

    manager.removeById(idToRemove);

    PostMovie[] actual = manager.getAll();
    PostMovie[] expected = new PostMovie[]{third, second};

//    assertEquals(expected, actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldNotRemoveIfNotExists() {
    MovieManager manager = new MovieManager();
    int idToRemove = 4;
    PostMovie first = new PostMovie(1, 1, "first", 1, 1);
    PostMovie second = new PostMovie(2, 2, "second", 1, 1);
    PostMovie third = new PostMovie(3, 3, "third", 1, 1);
    manager.add(first);
    manager.add(second);
    manager.add(third);

    manager.removeById(idToRemove);

    PostMovie[] actual = manager.getAll();
    PostMovie[] expected = new PostMovie[]{third, second, first};

    assertArrayEquals(expected, actual);
  }
}