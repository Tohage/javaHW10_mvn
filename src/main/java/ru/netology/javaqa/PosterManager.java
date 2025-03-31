package ru.netology.javaqa;


public class PosterManager {

    private String[] movies = new String[0];

    private final int limit;

    public PosterManager() {
        limit = 6;
    }

    public PosterManager(int resultLength) {
        this.limit = resultLength;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length -1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultlength;
        if (movies.length < limit) {
            resultlength = movies.length;
        } else {
            resultlength = limit;
        }
        String[] tmp = new String[resultlength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length -1 -i];
        }
        return tmp;
    }

}
