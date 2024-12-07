
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lesson111024 {

    public static void main(String[] args) {
        readFileNames("/home/user/java");

    }

    public static void readFileNames(String path) {

        FileReader fr = null;
        File myfile = new File(path);

        if (myfile.isFile()) {
            System.out.println("This is a file");

        } else {
            try {
                fr = new FileReader(myfile);
            } catch (FileNotFoundException ex) {
            }
            File[] arrayOfFiles = myfile.listFiles();
            for (File elementInFilesList : arrayOfFiles) {
                System.out.println(elementInFilesList.getName());

            }
        }
    }
}
