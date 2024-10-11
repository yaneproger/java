
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Arrays;

public class lesson071024 {

    public static void main(String[] args) {

        readFNames("/home/user/java/");

        System.out.println("NextFunction");
        System.out.println("NextFunction");

        System.out.println(Arrays.toString(readFileNamesInDir("/home/user/java/")));

        String pathProject = System.getProperty("user.dir");

        String pathFile = pathProject.concat("/lesson1.java");
        File checkFile = new File(pathFile);
        System.out.println(checkFile.getAbsolutePath());
        System.out.println(pathProject);

        System.out.println("System property: " + System.getProperty("user.dir"));

        System.out.println(LocalDateTime.now());
        System.out.println(getCurrentTime());
        System.out.printf("%s ocen %s%n", "eto", "xorowo");

        System.out.println(reverseString("Dobro pojalovat na java"));

    }

    public static LocalDateTime getCurrentTime() {
        return LocalDateTime.now();

    }

    // FileReader readfile = new FileReader(file);
    public static void readFNames(String path) {
        FileReader reader = null;

        File file = new File(path);
        if (file.isDirectory()) {
            try {
                reader = new FileReader(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            File[] arrfiles = file.listFiles();

            String[] filenamesString = new String[arrfiles.length];

            for (int i = 0; i < arrfiles.length; i++) {
                System.out.println(arrfiles[i].getName());
                filenamesString[i] = arrfiles[i].getName();
            }
            try {
                reader.close();

                // System.out.println(Arrays.toString(filenamesString));
                // for (File element : arrfiles) {
                //     System.out.println(element.getName());
                // }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new RuntimeException("Fayl ne papka");

        }

        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     } finally {
        //         try {
        //             reader.close();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
    }
// 

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

    public static String reverseString(String str) {

        String[] sentence = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = sentence.length - 1; i >= 0; i--) {

            sb.append(sentence[i]).append(" ");
        }

        return sb.toString();
    }

}
