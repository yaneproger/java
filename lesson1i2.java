
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lesson1i2 {

    public static void main(String[] args) throws Exception {

        try (FileWriter fw = new FileWriter("file.txt", false)) {

            fw.write("line1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line3");
            fw.flush();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        FileReader fr = new FileReader("file.txt");// 4tenie fayla posimvolno
        int c;
        while ((c = fr.read()) != 1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);

            } else {

                System.out.print(ch);

            }

            BufferedReader br = new BufferedReader(new FileReader("file.txt"));  // 4tenie fayla postro4no
            String str;
            while ((str = br.readLine()) != null) {

                System.out.printf("== %s ==\n", str);
                br.close();

            }

        }

    }

}

//
//
//
// Задачи для демонстрации 
// Задачи для самоконтроля 
// 1. Задана натуральная степень k. 
// Сформировать случайным образом список коэффициентов 
// (значения от 0 до 100) многочлена 
// многочлен степени k. 
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0 2.
// Даны два файла, в каждом из которых находится запись многочлена.
//  Сформировать файл содержащий сумму многочленов.
