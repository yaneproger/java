
import java.util.Scanner;

public class lesson1i1 {

    static void Hi() {

        lesson1lib.sayHi();

        // vizivaet klass static void sayHi()  iz fayla lesson1lib.java
    }

    static double factor(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factor(n - 1);

    }

    //ternarniy operator
    static void ternary() {

        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);

    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        boolean flag = iScanner.hasNextInt(); /// proverka na vvod integer zna4eniya  -4islovogo
        System.out.println(flag); // pe4ataet etot flajok
        String name = iScanner.nextLine();
        System.out.printf("int a : ");
        int z = iScanner.nextInt();
        System.out.printf("double o :");
        double o = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", z, o, z + o);
        System.out.println();
        System.out.printf("Privet, %s!\n\n", name);
        iScanner.close();

//
//
//
        String kl = "qwe";
        int sd = 12;
        String df = kl + sd;
        System.out.println(df);
        // mi zdes plo4im 4 stroki
        // Operaciya konkatenacii o4en zatratna - poetomu 
        // dla kajdix tipov est svoi operacii -string builder.
        // konkatenaciya Ocen zatratna

//
//
        int akl = 43;
        int asd = 12;
        int adf = akl + asd;
        System.out.println(df);
        String res = String.format(" %d+%d=%d \n   ", adf, akl, asd);
        System.out.printf(" %d+%d=%d \n   ", adf, akl, asd);
        System.out.println(res);

// %d - Dla cel4islenn zna4eniy
// %x - Dla 16-ri4nix 4isel
// %f - Dla float 4isel
// %e - Dla Eksponencialnogo vivoda
// %c - Dla odino4nogo vivoda
// %s - Dla vivoda strokovix zna4eniy
//
//
        float pi = 3.1415f;
        System.out.printf(" %2f\n", pi); // 3.14  - 
        /// Vivod tolko 2-x znakov posle zapatoy
        // takje i dla 3 i bolee znakov i v drugix tipax - e, double i dr.
        //

        //Oblast vidimosti:
        /// Globalniye peremennie - to 4to dostupno snaruji, dostupno i v kajdom metode
        // localniye peremenniye - to 4to dostupno v metode - Ne dostupno v klasse ili v drugix metodax
        // Funkcii i metodi - funkcii mogut ne prinadlejat klassam, a metodi prinadlejat
        //
        // V java vse funkcii yavlayutsa metodami
        //
        // Opisanie -> public class program {  
        // public static void main ,  Vizov -> (...) {  
        //  vozvrawaemoe zna4eniye -  return ....}
        //  zakritie skobki klassa --> }
        //       
        //
        //
        // Rekursivniye funkcii
        //
        Hi();
        lesson1lib.sayHi();

        ///
        // double v = factor(4);
        System.out.println(factor(4));

        ternary();

//
//
//
    }   // metod main zakrivaetsa
    ///
    //
    //

}
