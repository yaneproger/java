
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class lesson091224 {

    private static FileWriter fileWriter;

    public static void main(String[] args) {

        int[] arr = new int[]{6, 9, 5, 8, 4, 7, 3, 1, 2};

        sort(arr);

    }

    public static void sort(int[] arr) {

        boolean NeedToSort = true;
        while (NeedToSort == true) {

            NeedToSort = false;

            // }
            // for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    NeedToSort = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            try {
                fileWriter = new FileWriter("lesson091224.log.txt", true);
                fileWriter.write(Arrays.toString(arr));
                fileWriter.flush();
            } catch (IOException ex) {
            }

            // System.out.println(Arrays.toString(arr));
            Logger logger = Logger.getLogger("MyLog");
            // try {
            // FileHandler fh = new FileHandler("ItsLogTime.log", false);
            // logger.addHandler(fh);
            // fh.setFormatter(new SimpleFormatter());
            logger.info((Arrays.toString(arr)));
            // } catch (SecurityException | IOException e) {
            // logger.log(Level.SEVERE, "Произошла ошибка при работе FileHandler.");
            // }

        }

    }

}
