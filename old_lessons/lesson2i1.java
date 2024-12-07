
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lesson2i1 {

    private static Logger LOGGER = lesson2log.log(lesson2i1.class.getName());

    public static void main(String[] args) {

        LOGGER.log(Level.INFO, "Application started");

        String out = "/home/user/java";

        // System.out.println(Arrays.toString(readFileNames(out)));
        writeFileNamesFile("task1.txt", out);
        /* 
        FileReader fr = null; /// obyavlayem peremennuyu - fr zdes - 4tobi potom
        ///   zakrit ee v bloke finally

        try {
            fr = new FileReader("file.txt");  // Zdes otkrivaetsa potok processora  na obrabotku
            // i v bloke - finally on doljen bit zakrit - inace potok budet "viset" otkritim i ispolzovat RAM.
            System.out.println("Vipolnilsa kod 4teniya fayla");
            int x = 2 / 0;

        } catch (FileNotFoundException e) {

            throw new RuntimeException();
            // System.out.println("Kod dla obrabotki isklu4eniya (FileNotFoundException e)");

        } catch (ArithmeticException e) {

            System.out.println("kod dla obrabotki dleniya na nol - (x=2/0;)");

        } finally {     /// zdes potok zakrivaetsa
            try {

                fr.close();  // zdes fr zakrivaetsa

            } catch (IOException e) {

                throw new RuntimeException(e);
            }

            System.out.println("Finally");

        }

        System.out.println("Zdes vipolnaetsa ostalnaya logika");

         */
    }

    private static void writeFileNamesFile(String in, String out) {

        FileWriter fw = null;
        try {
            if (isThrowed()) {
                LOGGER.log(Level.SEVERE, "Voznikla owibka v metode zapisi - Podrobnoe opisanie ....");
                throw new RuntimeException("Voznikla owibka v metode zapisi - Podrobnoe opisanie ....");
            }
            fw = new FileWriter(in);
            String[] arr = readFileNames(out);
            for (int i = 0; i < arr.length; i++) {
                fw.write(arr[i] + "\n");

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            throw new RuntimeException(e);

        } finally {
            try {
                fw.close();

            } catch (IOException e) {
                throw new RuntimeException("Error closing file", e);
            }

        }

    }

    private static String[] readFileNames(String path) {
        // FileReader reader = null;
        File[] arrFiles;

        // try {
        File file = new File(path);
        if (file.isDirectory()) {

            if (isThrowed()) {
                LOGGER.log(Level.SEVERE, "Voznikla owibka v  metode 4teniya - Podrobnoe opisanie ....");
                throw new RuntimeException("Voznikla owibka v  metode 4teniya - Podrobnoe opisanie ....");
            }

            // reader = new FileReader(file);
            arrFiles = file.listFiles();
            String[] names = new String[arrFiles.length];
            for (int i = 0; i < arrFiles.length; i++) {
                names[i] = arrFiles[i].getName();
                // System.out.println(arrFiles[i].getName());

            }
            return names;

        } else {
            throw new RuntimeException("File is not a directory");
        }
        // } catch (RuntimeException e) {
        //     e.printStackTrace();
        // } 
        // finally {
        // //     //// zdes potok zakrivaetsa
        //     try {
        //         reader.close();  // zdes fr zakrivaetsa
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }
        // return arrFiles;
    }

    private static boolean isThrowed() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }

}
