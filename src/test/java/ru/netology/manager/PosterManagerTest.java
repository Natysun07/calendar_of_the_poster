package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {
    PosterFilms films1 = new PosterFilms("Бладшот", "боевик", 1);
    PosterFilms films2 = new PosterFilms("Вперёд", "мультфильм", 2);
    PosterFilms films3 = new PosterFilms("Отель Белград", "комедия", 3);
    PosterFilms films4 = new PosterFilms("Джентельмены", "боевик", 4);
    PosterFilms films5 = new PosterFilms("Человек-невидимка", "ужасы", 5);
    PosterFilms films6 = new PosterFilms("Тролли. Мировой тур", "мультфильм", 6);
    PosterFilms films7 = new PosterFilms("Номер один", "комедия", 7);


    @Test
    public void addOneFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm(films4);
        PosterFilms[] expected = {films4};
        PosterFilms[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void addNoFilm() {
        PosterManager manager = new PosterManager();
        PosterFilms[] expected = {};
        PosterFilms[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addFewFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm(films1);
        manager.addFilm(films2);
        manager.addFilm(films3);
        manager.addFilm(films4);
        manager.addFilm(films5);

        PosterFilms[] expected = {films1, films2, films3, films4, films5};
        PosterFilms[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm(films1);
        manager.addFilm(films2);
        manager.addFilm(films3);
        manager.addFilm(films4);
        manager.addFilm(films5);
        PosterFilms[] expected = {films5, films4, films3};
        PosterFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLast1() {
        PosterManager manager = new PosterManager(7);
        manager.addFilm(films1);
        manager.addFilm(films2);
        manager.addFilm(films3);
        manager.addFilm(films4);
        manager.addFilm(films5);
        manager.addFilm(films6);
        manager.addFilm(films7);
        PosterFilms[] expected = {films7, films6, films5, films4, films3, films2, films1};
        PosterFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast2() {
        PosterManager manager = new PosterManager(5);
        manager.addFilm(films1);
        manager.addFilm(films2);
        manager.addFilm(films3);

        PosterFilms[] expected = {films3, films2, films1};
        PosterFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {
        PosterManager manager = new PosterManager();
        manager.addFilm(films1);
        manager.addFilm(films2);
        manager.addFilm(films3);
        manager.addFilm(films4);
        manager.addFilm(films5);
        manager.addFilm(films6);
        manager.addFilm(films7);
        PosterFilms[] expected = {films7, films6, films5, films4, films3};
        PosterFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}



