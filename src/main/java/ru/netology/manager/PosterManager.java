package ru.netology.manager;

public class PosterManager {
    private PosterFilms[] films = new PosterFilms[0];
    private int quantity;

    public PosterManager() {
        this.quantity = 5;
    }

    public PosterManager(int quantity) {
        this.quantity = quantity;
    }

    public void addFilm(PosterFilms film) {
        PosterFilms[] tmp = new PosterFilms[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;


    }

    public PosterFilms[] findAll() {
        return films;

    }

    public PosterFilms[] findLast() {
        int posterLength;
        if (films.length < quantity) {
            posterLength = films.length;
        } else {
            posterLength = quantity;
        }
        PosterFilms[] tmp = new PosterFilms[posterLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }


}




