
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// import java.util.logging.Level;
// import java.util.logging.Logger;
// import java.lang.System.Logger;
public class lesson2 {

//     public class logger(){
//     Logger logger = Logger.getLogger("log");
//     try{
//     FileHandler fh = new FileHandler("log.txt",true);
//       logger.addHandler(fh);
//       fh.setFormatter(new SimpleFormatter());
//       logger.info("Log message");
//         } catch  (FileNotFoundException e)
//         {
//        logger.log(Level.SEVERE, "Произошла ошибка при работе с FileHandler.", e);
//         }
//     Logger logger = Logger.getLogger("MyLog");
//     try {
//     FileHandler fh = new FileHandler("ItsLogTime.log", true);
//     logger.addHandler(fh);
//     fh.setFormatter(new SimpleFormatter());
//     logger.info("Log message");
//     } catch (SecurityException | IOException e) {
//     logger.log(Level.SEVERE, "Произошла ошибка при работе с FileHandler.", e);
//     }
//     }
//   }
// private static Logger LOGGER = Log.log(Task1.class.getName());
    // private static Logger Lesson2Logger = lesson2log.log(lesson2.class.getName());
    private static Logger Lesson2Logger = Logger.getLogger(name);

    // private static Logger Lesson2logger = lesson2log.log(lesson2.class.getName());
    public static void main(String[] args) {

        Lesson2Logger.log(Level.INFO, "Prilojenie startovalo");

        System.out.println(Arrays.toString(Readfilenamesindir(".")));

        wirtefileNamesinDir("filenames.txt", ".");

        // DirectoryReader(".");
        FileReader fr = null;

        try {
            fr = new FileReader("file.txt");
            System.out.println("Vipolnayetsa kod 4teniya fayla - Step 1");
            int x = 2 / 0;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            throw new RuntimeException(e);
            // System.out.println("Vipolnaetsa kod dla obrabotki voznikwego isklu4eniya - Step Catch 1");
        } catch (ArithmeticException e) {
            System.out.println("Obrabotka deleniya na nol- Step Catch 2");
        } finally {
            try {
                fr.close(); // Zdes Obazatelno Zakrivayem potok na zapis!
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Finally - blok v kotorom zakrivayutsa Otkritie Potoki");
        }

        System.out.println("Vipolnayetsa ostalnaya logika kotoraya ne vizivayet owibok - Step 2");

        // System.out.println(Stringcheck());
        // Stringcheck();
    }

    private static void wirtefileNamesinDir(String in, String out) {

        FileWriter fw = null;//inicializiruem Filewriter kak null
        try {
            if (isThrowed()) {
                Lesson2Logger.log(Level.SEVERE, "Voznikla owibka  v metode zapisi - Podrobnoe Opisanie owibki");
                throw new RuntimeException("Voznikla owibka  v metode zapisi - Podrobnoe Opisanie owibki");
            }

            fw = new FileWriter(in);  // inicializiruem filewrter -fw na osnove puti - "in" - String in
            String[] arr = Readfilenamesindir(out); // sozdaem massiv strok arr 
            // i vizivaem metod - Readfilenamesindir kotoriy zappolnayet ego imenami faylov
            // i ukazivaem otkuda emu 4itat - "out"  to est  - "String out"
            for (int i = 0; i < arr.length; i++) {
                fw.write(arr[i] + "\n"); // zdes s pomowyu cikla 
                //      zapisivaem vse v masssiv - "arr" - 4erez FileWriter.

            }

        } catch (IOException ex) {
        } finally {
            try {
                fw.close();;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw new RuntimeException("Error when closing file");
            }
        }

    }

    private static String[] Readfilenamesindir(String path) {

        File file = new File(path);

        if (file.isDirectory()) {
            if (isThrowed()) {
                Lesson2Logger.log(Level.SEVERE, "Voznikla owibka  v metode 4teniya - Podrobnoe Opisanie owibki");
                throw new RuntimeException("Voznikla owibka v metode 4teniya - Podrobnoe Opisanie owibki");
            }

            File[] files = file.listFiles();  // Zdes visivaem metod kotoriy vozvrawaet spisok faylov - listFiles.

            String[] filenames = new String[files.length];

            for (int i = 0; i < files.length; i++) {
                filenames[i] = files[i].getName(); // Zapolnayem massiv "filenames" - imenami faylov is "files"

            }

            return filenames;
        } else {
            throw new RuntimeException("file is not directory");
        }

    }

    public static void DirectoryReader(String path) {
        FileReader reader = null;
        try {
            File file = new File(path);
            if (file.isDirectory()) {

                File[] arrayoffiles = file.listFiles();

                for (File elem : arrayoffiles) {
                    System.out.println(elem.getPath());

                }

                reader = new FileReader(file);
            } else {
                throw new IOException("File is not directory");
            }

        } catch (IOException ex) {
            System.out.println("File not found");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();   ///Raspe4atat postro4no na kkaoy stro4ke voznikla owibka otkuda voznikla i t.d.
            }

        }

    }

    private static boolean isThrowed() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}

// public static void Stringcheck() {
//     String data = null;
//     StringBuilder sb = new StringBuilder();
//     for (int i = 0; i < 50000; i++) {
//         sb.append("+").toString();
//         // String[] arr = new String[sb.length()];
//         // data = sb.toString();
//         // sb.append(arr);
//         System.out.println(sb);
//     }
//     // return data;
// }
// try {
//     FileReader fr = new FileReader("file.txt");
// } catch (FileNotFoundException e) {
//     System.out.println();
// }
// }
// private static Logger LOGGER = Log.log(Task1.class.getName());
//     public static void main(String[] args) {
//         LOGGER.log(Level.INFO, "Приложение стартовало");
//         String out = "C:\\Users\\lexle\\Downloads";
//         writeFileNamesInFile("task1.txt", out);
//     }
//     private static void writeFileNamesInFile(String in, String out) {
//         FileWriter fw = null;
//         try {
//             fw = new FileWriter(in);
//             if (isThrowException()) {
//                 LOGGER.log(Level.SEVERE, "Возникла ошибка в методе записи: Тут должно быть ее подробное описание");
// //                throw new RuntimeException("Возникла ошибка в методе записи: Тут должно быть ее подробное описание");
//             }
//             String[] arr = readFileNamesInDir(out);
//             for (String s : arr) {
//                 fw.write(s + "\n");
//             }
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         } finally {
//             try {
//                 fw.close();
//             } catch (IOException e) {
//                 LOGGER.log(Level.SEVERE, e.getMessage(), e);
//                 throw new RuntimeException("Error closing file", e);
//             }
//         }
//     }
//     private static String[] readFileNamesInDir(String path) {
//         File file = new File(path);
//         if (file.isDirectory()) {
//             if (isThrowException()) {
//                 LOGGER.log(Level.SEVERE, "Возникла ошибка в методе чтения: Тут должно быть ее подробное описание");
// //                throw new RuntimeException("Возникла ошибка в методе чтения: Тут должно быть ее подробное описание");
//             }
//             File[] files = file.listFiles();
//             String[] names = new String[files.length];
//             for (int i = 0; i < files.length; i++) {
//                 names[i] = files[i].getName();
//             }
//             return names;
//         } else {
//             throw new RuntimeException("File is not a directory");
//         }
//     }
//     private static boolean isThrowException() {
//         int a = 0;
//         int b = 2;
//         int digit = a + (int) (Math.random() * b);
//         System.out.println(digit);
//         return digit > 0;
//     }
// }
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// public class lesson2 {
//     public static void main(String[] args) {
//         readFileNames(".");
//     }
//     public static void readFileNames(String path) {
//         FileReader reader = null;
//         try {
//             File file = new File(path);
//             reader = new FileReader(file);
//             if (file.isDirectory()) {
//                 File[] arrFiles = file.listFiles();
//                 for (File elem : arrFiles) {
//                     System.out.println(elem.getName());
//                 }
//             } else {
//                 throw new IOException("Файл не является папкой!");
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 reader.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// private static boolean isThrow() {
//     int a = 0;
//     int b = 2;
//     int digit = a + (int) (Math.random() * b);
//     System.out.println(digit);
//     return digit > 0;
// }
//
//
// import java.io.FileInputStream;
// import java.util.logging.LogManager;
// import java.util.logging.Logger;
// public class Log {
//     static {
//         try (FileInputStream in = new FileInputStream("log.config")) { //относительный путь до файла с конфигами
//             LogManager.getLogManager().readConfiguration(in);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
//     public static Logger log(String className) {
//         return Logger.getLogger(className);
//     }
// }
