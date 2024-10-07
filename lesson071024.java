
import java.io.File;
import java.util.Arrays;

public class lesson071024 {

    public static void main(String[] args) {
        // readFileNames("/etc");

        System.out.println(Arrays.toString(readFileNamesInDir(".")));

    }

    // public static void readFileNames(String path) {
    //     FileReader reader = null;
    //     try {
    //         File file = new File(path);
    //         if (file.isDirectory()) {
    //             reader = new FileReader(file);
    //             File[] arrfiles = file.listFiles();
    //             for (File elfile : arrfiles) {
    //                 System.out.println(elfile.getName());
    //             }
    //         } else {
    //             throw new IOException("Fayl ne papka");
    //         }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     } finally {
    //         try {
    //             reader.close();
    //         } catch (IOException e) {
    //             e.printStackTrace();
    //         }
    //     }
    // }
    public static String[] readFileNamesInDir(String path) {

        File file = new File(path);
        if (file.isDirectory()) {

            File[] arrfiles = file.listFiles();

            String[] names = new String[arrfiles.length];

            for (int i = 0; i < arrfiles.length; i++) {
                names[i] = arrfiles[i].getName();

            }
            return names;

        } else {
            throw new RuntimeException("Fayl ne papka");

        }
    }

}
