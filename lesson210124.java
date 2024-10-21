
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

public class lesson210124 {

    static FileWriter fileWriter;

    public static void main(String[] args) {

        File file = new File("log.txt");
        try {
            fileWriter = new FileWriter(file);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Vvedite 1-oe cislo : ");
            int a = scanner.nextInt();
            System.out.print("Vvedite operaciyu ( + - *  /) : ");
            char op = scanner.next().charAt(0);
            System.out.print("Vvedite vtoroe cislo : ");
            int b = scanner.nextInt();
            String res = null;
            switch (op) {

                case '+' ->
                    res = a + " + " + b + " = " + add(a, b);
                case '-' ->
                    res = a + " - " + b + " = " + minus(a, b);
                case '*' ->
                    res = a + " * " + b + " = " + multi(a, b);
                case '/' ->
                    res = a + " / " + b + " = " + divide(a, b);
                default ->
                    System.out.println("Vrong operation");

            }
            System.out.println(res);
            // fileWriter.append(res + ": " + System.currentTimeMillis() + '\n');
            // fileWriter.write(new Timestamp(System.currentTimeMillis()) + ": " + res + '\n');
            fileWriter.append(new Timestamp(System.currentTimeMillis()) + ": " + res + '\n');
            fileWriter.close();

        } catch (IOException ex) {
            System.out.println("Proizowlo isklu4enie pri rabote s faylom.");
        }

    }

    private static int add(int a, int b) {
        return a + b;

    }

    private static int minus(int a, int b) {
        return a - b;

    }

    private static int multi(int a, int b) {
        return a * b;

    }

    private static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        return -1;

    }

}
