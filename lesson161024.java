
import java.lang.*;
import java.util.Stack;

public class lesson161024 {

    public static boolean isDigit(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // private static boolean isDigit(String string) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
    public static void main(String[] args) {

        // }
        // public static void mystack1() {
        // var exp = "20 30 - 10 * ".split(" "); //(20-30)*10
        // var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        //
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        int res = 0;
        // System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {

                st.push(Integer.parseInt(exp[i]));

            } else {

                switch (exp[i]) {
                    case "+" -> {
                        res = st.pop() + st.pop();
                        st.push(res);
                    }

                    case "-" -> {
                        res = -st.pop() + st.pop();
                        st.push(res);
                    }

                    case "*" -> {
                        res = st.pop() * st.pop();
                        st.push(res);
                    }

                    case "/" -> {
                        res = st.pop() / st.pop();
                        st.push(res);
                    }

                    default ->
                        throw new AssertionError();
                }

            }

        }
        System.out.printf("%d\n", st.pop());

    }

}
