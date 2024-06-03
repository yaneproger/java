
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

class BubbleSort {

    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        for (int j = 1; j < mas.length; j++) {

            for (int i = 0; i < mas.length - 1; i++) {

                if (mas[i] > mas[i + 1]) {

                    int temp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = temp;
//             System.out.println(mas[i]);

                }
//           System.out.println();

            }
            for (int k = 0; k < mas.length; k++) {

                System.out.println(mas[k]);
            }
            System.out.println("/");

            Logger logger = Logger.getLogger("log");
            logger.setUseParentHandlers(false);
            try {
                FileHandler fh = new FileHandler("log.ex2.txt", 0, 1, true);

                logger.addHandler(fh);

                fh.setFormatter(new SimpleFormatter());
                logger.info("Log message");
            } catch (SecurityException | IOException e) {
                logger.log(Level.SEVERE, "Произошла ошибка при работе с FileHandler.", e);
            }

        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class lesson2Exercise2 {

    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.ex2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
