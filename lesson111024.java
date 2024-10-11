
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lesson111024 {

    public static void main(String[] args) {
        readFileNames("/home/user/java/lesson1.java");

    }

    public static void readFileNames(String path) {

        FileReader fr = null;
        File myfile = new File(path);

        try {
            if (myfile.isDirectory()) {
                fr = new FileReader(myfile);
                File[] arrayOfFiles = myfile.listFiles();
                for (File iterable_element : arrayOfFiles) {
                    System.out.println(iterable_element.getName());

                }

                // fr=new FileReader(myfile.listFiles());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        // finally {
        //     try {
        //         fr.close();
        //     } catch (IOException e) {

        //     }
        // }
    }

}
