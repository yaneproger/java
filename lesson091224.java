
import java.io.FileWriter;

public class lesson091224 {

    private static FileWriter fileWriter;

    public static void main(int[] arr) {

    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                int temp = arr[i] + 1;
                if (arr[i] > arr[i + 1]) {

                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

                fileWriter = new FileWriter("lesson091224.log.txt", true);
                fileWriter.write(Arrays.toString(arr));
                fileWriter.flush();

            }

        }

    }

}
