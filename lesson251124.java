
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lesson251124 {

    private static Logger LOGGER = lesson251124log.logmethod(lesson251124.class.getName());

    private static boolean trueorfalse() {

        int digit = 0 + (int) (Math.random() * 2);
        System.out.println("digit is :" + digit);
        return digit > 0;
    }

    public static void main(String[] args) {

        LOGGER.log(Level.SEVERE,
                "Prilojenie startovalo");

        String out = "/";// myscanner();
        // while (true) {
        // myagerequest();
        // }
        // mymassive();
        // reverse("Dobro poj na kurs");
        // myfr();
        reader("/");
        writer("/home/user/java/251124.txt", out);
        trueorfalse();
    }

//  metod kotoriy zapisivaet soderjimoe tekuwey papki 
    public static String[] writer(String in, String out) {
        if (trueorfalse()) {

            LOGGER.log(Level.SEVERE, "Voznikla owibka v metode zapisi");
            throw new RuntimeException("Voznikla owibka v metode zapisi");
        }

        FileWriter mywriter = null;
        String[] array = new String[]{};
        try {
            mywriter = new FileWriter(in);
            array = reader(out);
            for (int i = 0; i < array.length; i++) {
                mywriter.write(array[i] + "\n");
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                mywriter.close();
            } catch (IOException e) {
                throw new RuntimeException("error closiong file", e);
            }
            System.out.println();
        }
        return array;
    }

//  metod kotoriy vozvrawaet soderjimoe tekuwey papki kak massiv strok
    public static String[] reader(String dirpath) {
        FileReader myreader = null;
        String[] names = new String[]{};
        // try {
        File myfile = new File(dirpath);
        try {
            myreader = new FileReader(myfile);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
        if (myfile.isFile()) {
            try {
                System.out.println("file is not dir");
                throw new IOException("is not directory");
            } catch (IOException exception) {
            }

        } else {

            File[] arrayoffiles = myfile.listFiles();
            names = new String[arrayoffiles.length];
            for (int i = 0; i < arrayoffiles.length; i++) {
                System.out.printf("%s ", arrayoffiles[i].getName());
                names[i] = arrayoffiles[i].getName();
            }

            System.out.println();

        }
        return names;
        // } catch (FileNotFoundException ex) {
        // } finally {
        //     try {
        //         myreader.close();
        //         System.out.println(myreader);

        //     } catch (IOException exception) {
        //     }
        // }
    }

    private static void myscanner() {

        System.out.println("Hello world!");
        System.out.println(LocalDateTime.now());

        System.out.println("Enter u'r Name");
        Scanner myscanner = new Scanner(System.in);
        String myname = myscanner.nextLine();
        System.out.println("Privet" + myname + "!");
        myscanner.close();
        //
        // if late than 12:00 - good afternoon
        // else - good morning

        LocalTime timenow = LocalTime.now(ZoneId.of("GMT+4"));
        int hournow = timenow.getHour();
        System.out.println(hournow);
        if (hournow > 5 & hournow < 12) {
            System.out.println("Good morning!");

        } else {
            System.out.println("Good afternoon!");
        }

    }

    public static void myagerequest() {

        LocalTime timenow = LocalTime.now(ZoneId.of("GMT+4"));
        int hournow = timenow.getHour();

        System.out.println("enter  age input");
        Scanner keyenter = new Scanner(System.in);
        int agerequest;
        agerequest = keyenter.nextInt();

        try {

            if (agerequest < 5 & hournow < 10) {

                System.out.println("give a milk this child");
            }

            if (agerequest < 5 & hournow > 10 & hournow < 12) {

                System.out.println("give a breakfast this child");
            }

            if (agerequest < 5 & hournow > 12 & hournow < 15) {

                System.out.println("give a dinner");
            }

            if (agerequest < 5 & hournow > 12 & hournow < 17) {

                System.out.println("give a food this child");
            }

            if (agerequest < 5 & hournow > 12 & hournow < 20) {

                System.out.println("give a food this child and its time to go to bed");
            }

            if (agerequest > 5 & agerequest < 25 & hournow > 10) {

                System.out.println("give a dinner to this child");
            }

            if (agerequest > 25 & hournow < 10) {

                System.out.println("make your breakfast");
            } else {
                System.out.println("wrong parameters");
            }

        } catch (InputMismatchException e) {
            System.out.println("Wrong Input");

        }

    }

    // dan massiv celix cisel
    public static void mymassive() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 7, 8, 9};
        int[] arr2 = new int[5];

        System.out.println(Arrays.toString(arr1));
        arr1[1] = 55;
        System.out.println(Arrays.toString(arr1));

        int summ = 0;
        for (int i = 0; i < arr.length; i++) {

            summ = summ + arr[i];

        }
        System.out.println("summ or array's elements : " + summ);

    }

    public static void reverse(String mystr) {

        String[] arr = mystr.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.printf("%s  ", arr[i]);
            String temp = arr[i];
            sb.append(temp).append(" ");

        }
        System.out.println(sb);
    }

    // otrivaem potok na chteniye fayla
    public static void myfr() {

        FileReader fr = null;
        try {
            fr = new FileReader("fr.txt");

            System.out.println("vipolnilsa kod chteniya");

            int x = 2 / 0;
        } catch (FileNotFoundException e) {
            System.out.println("vozniklo isklucheniye - fayl ne nayden");
            throw new RuntimeException();

        } catch (ArithmeticException e) {

            System.out.println("Delenie na nol");

        } finally {

            System.out.println("finally");

            try {
                fr.close();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
            System.out.println("Ostalnaya logika");
        }
    }

}
