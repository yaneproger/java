
import java.util.Scanner;

public class lessn181024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] statistics = new int[26];
        char a = 'a';
        char c;
        int noA = a; //97

        System.out.println("vvedite stroku");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {

            c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                statistics[c - noA]++;

            }

        }
        System.out.println("Resultat raboti programmi");;
        for (int i = 0; i < statistics.length; i++) {

            if (statistics[i] > 0) {

                char cc = (char) (i + noA);
                System.out.printf("%s:%d\n", cc, statistics[i]);

            }

        }

    }

//     // class URLBuilder { 
//     public static String buildURL(String baseURL, String params) {
//         // Введите свое решение ниже } } 
//         // Не удаляйте этот класс-он нужен для вывода результатов на экран и проверки 
//         // public class Printer {
//     public static void main(String[] args) {
//         String baseURL = "";
//         String params = "";
//         if (args.length == 0) {
//             // При отправке кода на Выполнение, вы можете варьировать эти параметры 
//             baseURL = "https://example.com/search?";
//             params = "query=java&sort=desc&filter=null";
//         } else {
//             baseURL = args[0];
//             params = args[1];
//         }
//         URLBuilder ans = new URLBuilder();
//         System.out.println(ans.buildURL(baseURL, params));
//     }
// }
}
