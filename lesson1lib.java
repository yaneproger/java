
public class lesson1lib {

    static void sayHi() {
        System.out.println("hi");

    }

    public static void main(String[] args) {

        char ch = ']';
        System.out.println(ch);
        System.out.println();
        ch = 555;   // Po4emu zdes pe4ataetsa  "{ "  a ne kvadratnaya skobka "]"
        // ch = 000;
        System.out.println(ch);
        int a = 123;
        System.out.println(a--);
        System.out.println(--a);
        a = a-- - --a;
        a = (a--) - (--a);
        a = a-- - --a;
        a = --a - --a;
        System.out.println(a);

    }

}
