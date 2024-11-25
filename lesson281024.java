
public class lesson281024 {

    public static int factorial(int n) {

        int result = 1;

        if (n < 0) {
            return -1;
        } else {

            for (int i = 2; i <= n; i++) {

                result = result * i;
            }

        }
        return result;
    }

    public static String buildURL(String baseURL, String params) {

        StringBuilder url = new StringBuilder(baseURL);

        String[] pairs = params.split("&");

        for (int i = 0; i < pairs.length; i++) {
            {
                String[] keyValue = pairs[i].split("=");

                if (!"null".equals(keyValue[1])) {

                    if (i > 0) {
                        url.append("&");
                    }

                    url.append(keyValue[0]).append("=").append(keyValue[1]);
                }
            }

        }
        return url.toString();
    }

// }
// public class Printer{
    public static void main(String[] args) {

        System.out.printf("%s %d\n", "Factorial equals - ", factorial(5));

        String baseURL = "";

        String params = "";

        if (args.length == 0) {

            baseURL = "https://example.com/search?";

            params = "query=java&sort=desc&filter=null";

        } else {

            baseURL = args[0];

            params = args[1];

        }

        lesson281024 ans = new lesson281024();

        System.out.println(ans.buildURL(baseURL, params));

    }

}
