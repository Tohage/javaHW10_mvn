package ru.netology.javaqa;

public class Main {

    public static void main(String[] args) {

        DataMovie one = new DataMovie(1, "Бладшот", "Боевик");
        DataMovie two = new DataMovie(2, "Вперед", "Мультфильм");
        DataMovie three = new DataMovie(3, "Отель белград", "Комедия");
        DataMovie four = new DataMovie(4, "Джентельмены", "Боевик");
        DataMovie five = new DataMovie(5, "Человек невидимка", "Ужасы");
        DataMovie six = new DataMovie(6, "Тролли", "Мультфильм");
        DataMovie seven = new DataMovie(7, "Номер один", "Комедия");
        DataMovie eight = new DataMovie(8, "Вверх", "Мультфильм");
        DataMovie nine = new DataMovie(9, "Ридик", "Боевик");
        DataMovie ten = new DataMovie(10, "Оно", "Ужасы");
        DataMovie eleven = new DataMovie(11, "Матрица", "Боевик");

        PosterManager manager = new PosterManager();

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        DataMovie[] all = manager.findAll();

        DataMovie[] last = manager.findLast();
    }
}
