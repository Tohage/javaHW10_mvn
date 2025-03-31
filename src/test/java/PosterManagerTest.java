import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.PosterManager;

public class PosterManagerTest {


    @Test
    public void showMoviesReversAdded() {

        PosterManager manager = new PosterManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Троли. Мировой тур");


        String[] actual = manager.findLast();
        String[] expected = { "Троли. Мировой тур","Человек-невидимка", "Джентельмены", "Отель Белград","Вперед","Бладшот"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAll() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Троли. Мировой тур");
        manager.addMovie("Номер один");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Троли. Мировой тур", "Номер один"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLessLimit() {

        PosterManager manager = new PosterManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");


        String[] actual = manager.findLast();
        String[] expected = { "Человек-невидимка", "Джентельмены", "Отель Белград","Вперед","Бладшот"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showIfAddedMoreLimit() {

        PosterManager manager = new PosterManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Троли. Мировой тур");
        manager.addMovie("Матрица");


        String[] actual = manager.findLast();
        String[] expected = { "Матрица","Троли. Мировой тур","Человек-невидимка", "Джентельмены", "Отель Белград","Вперед"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showIfLimitLess() {

        PosterManager manager = new PosterManager(4);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Троли. Мировой тур");
        manager.addMovie("Матрица");


        String[] actual = manager.findLast();
        String[] expected = { "Матрица","Троли. Мировой тур","Человек-невидимка", "Джентельмены"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
