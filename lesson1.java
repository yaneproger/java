

/*
 * 
 * Program
 */
//this is a Comments
public class lesson1 {

    public static void main(String[] args) {

        String perem = "novaya stroka";
        float f = 123.456f;
        double d = 45.89D;
        System.out.println(f);
        System.out.println(d);
        char ch = ']';
        System.out.println(ch);
        ch = 123;   // Po4emu zdes pe4ataetsa  "{ "  a ne kvadratnaya skobka "]"
        System.out.println(ch);

        System.out.println(perem);
        int a = 13;
        System.out.println(a);
        double b = a;
        System.out.println(b);
        // a=b;  ne poluchitsa tak kak double zanimaet bolwe mesta v pamati
        boolean flag1 = 123 < 234;
        System.out.println(flag1);
        boolean flag2 = 123 > 234 || flag1;   // operaciya && slojeniya
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);
        boolean flag4 = true ^ false;  // operand ^ daet true Tolko togda, kogda odno Strogo true ili false
        System.out.println(flag4);
        boolean flag5 = true ^ true;
        System.out.println(flag5);
        var i = 234_454_233; // razdelayem razradi nijnim pod4erkivaniem - "_"
        System.out.println(i);
        System.out.println(getType(i)); // integer
        System.out.println(Integer.MAX_VALUE);
        var j = 1.25;
        System.out.println(Character.MAX_VALUE);

        System.out.println(getType(j)); // double
        System.out.println(Double.MAX_VALUE);

        String s = "qwer";
        System.out.println(s.charAt(1));

        int e = 123;
        // e++;
        System.out.println(e++);  //  operaciya PreFiksnogo incrementa " e++" imeet prioritet NIJE 4em sys-out
        System.out.println(e);

        System.out.println(++e);  //operaciya postFiksnogo incrementa " ++e" imeet prioritet Viwe 4em sys-out
        System.out.println(e);

        int k = 123;
        k = k-- - --k;
        System.out.println(k);
        k = --k - k--;
        System.out.println(k);
        System.out.println(k--);
        System.out.println(--k);

//       || - konyunkciya - logi4eskoe "I"
//        && - disyunkciya - logicheskoe " ILI"
//        ^  -  РАЗДЕЛИТЕЛЬНАЯ ДИЗЪЮНКЦИЯ  -   Предложение  A ^ B -  считается истинным в случае, 
//                      если истинно А и ложно В, 
//                            или в случае, если ложно А и истинно В. 
//               В остальных случаях оно считается ложным.
        //      Побитовый свдиг влево (<<), побитовый сдвиг вправо (>>)
        int t = 8;
        // 1000 - dvoi4noe zna4enie
        t = t << 1;
        // 10000 - sdvinuli vlevo na 1 - polu4ili 16
        System.out.println(t);

        t = 18;
        // 10010 - dvoi4noe zna5enie 18-ti
        t = t >> 1;
        // 
        // sdvinuli vpravo - polu4ili -  1001 - 9 - tut odin 0 - otbrasivaem
        System.out.println(t);

        /*
             * 
int a = 5;        // в двоичной системе: 0000000000000101
int b = a << 3;   // в двоичной системе: 0000000000101000, или 40 в десятичной
int c = b >> 3;   // в двоичной системе: 0000000000000101, или снова 5, как было изначально
Следует иметь ввиду, что при сдвиге значения x на y бит (x<<y), самые левые y бит в исходном числе x теряются, т.к. они буквально выталкиваются за его пределы.

?
int a = 5;        // в двоичной системе: 0000000000000101
int b = a << 14;  // в двоичной системе: 0100000000000000 - первая 1 в 101 исчезла
Если вы уверены, что ни один из битов в сдвигаемом числе не пропадет, то для простоты можно считать, что оператор сдвига << умножает левый операнд на 2 в степени, показателем которой является правый операнд. Например, для получения степеней 2 могут быть использованы следующие выражения:

?
1 <<  0  ==    1
1 <<  1  ==    2
1 <<  2  ==    4
1 <<  3  ==    8
             * 
             * 
             * 
             * 
             * 
             * 
         */
//   pobitovie operacii -     ili  "|"
        int y = 5;
        int g = 2;
// 5 - 101
// 2 - 010
// primenayem logi4eskoe ili - 
// 1 ili 0 - ravno 1
// polu4aem - 111 - ravno 7
        System.out.println(y | g);

// esli ispolzovat pobitovoe i - "&"
//  1 i 0 -ravno 0
// polu4aem - 000 - ravno 0
        System.out.println(y & g);

// razdelitelnaya disyunkciya  - "^" - ( razdelitelnoe "ili")
//   strogo kogda odno iz nix ravno istine
// 1 ili 0 = 1,  0 ili 1 = 1  ,  1 - istina, 0 - loj
// polu4aem 111  - ravno  7
        System.out.println(y ^ g);

        String v = "rtye1";  //  dlina  stroki ranva 4 - indeksi ot 0..do..3
        boolean c = v.length() >= 5 & v.charAt(4) == '1';
        // pri ispolzovanii odnogo operatora "&" ili "|"  vmesto   "&&" ili  "||" sootvetstvenno
        // kompilator budet smotret obe storoni virajenoya
        //  daje nesmotra esli odna iz storon uje daet True ili False,
        // poetomu pri ispolzovanii odnogo "&" ili "|" vmesto dvoynogo "&&"  ili "||"
        // mojet vixodit owibka

        System.out.println(c);

        int[] arr = new int[10];
        System.out.println(arr.length);

        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr.length);
// dvumernie massivi

//  eto MASSIVI MASSIVOV - NE SOVSEM DVUMERNIE MASSIVI
//
        int[] arr1[] = new int[3][5];   //  integer, tip dannix -massiv , nazvanie massiva , identifikator- [], 
        // i dalwe
        //       ukazivaem 4to  zdes 3 stroki i 5 stolbcov
        for (int[] line : arr1) {
            System.out.println();

            for (int item : line) {
                System.out.printf("%d", item);
            }
        }

        System.out.println();

        int[][] arr3 = new int[3][5];

        for (int m = 0; m < arr3.length; m++) {
            System.out.println();

            for (int l = 0; l < arr3[m].length; l++) {
                arr3[m][l] = m + l;
                System.out.printf("%d", arr3[m][l]);

            }
        }

        int x = 123;
        double n = x;
        System.out.println(x);
        System.out.println(n);
        n = 3.1425;
        x = (int) n;
        System.out.println(n);
        System.out.println(x);
        byte h = Byte.parseByte("123");
        System.out.println(h);
        h = Byte.parseByte("123");  // eto dast owibku - tak kak max razmer dla Byte -255 simvolov
        System.out.println(h + n);

    }

    static String getType(Object o) {

        return o.getClass().getSimpleName();
    }

}
