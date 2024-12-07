
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lesson3 {

    public static void main(String[] args) {
        listfill();
        listtest();

    }

    public static void listfill() {

        Random rand = new Random();

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100);
            System.out.println(array[i]);

        }

        // System.out.println(array);
        // Collections.sort();
    }

    // Создать список типа ArrayList<String>.
    // Поместить в него как строки, так и целые числа. 
    // Пройти по списку, найти и удалить целые числа.
    // Каталог товаров книжного магазина сохранен в виде двумерного 
    // списка List<ArrayList<String>> так, что на 0-й позиции каждого
    //  внутреннего списка содержится название жанра, 
    //  а на остальных позициях - названия книг. 
    //  Напишите метод для заполнения данной структуры.
    public static void listtest() {
        List<ArrayList<String>> books = new ArrayList<>();
        ArrayList<String> proza = new ArrayList<>(List.of("proza", "Voina i mir", "Buratino"));
        ArrayList<String> poeziya = new ArrayList<>(List.of("poesiya", "Baradino", "Onegin"));
        ArrayList<String> skazki = new ArrayList<>();
        skazki.add("skazki");
        skazki.add("mawa");
        skazki.add("miwa");

        books.addAll(List.of(proza, poeziya, skazki));
        System.out.println(books);
    }

}
