
class Answer {

    public void printPrimeNums() {
        // Напишите свое решение ниже

        int[] arr = new int[1000];
        int[] arr2 = new int[]{2, 3, 5, 7};
        int[] arr3 = new int[1000];

        for (int i = 0; i <= 10; i++) //            if(i/i==1 && i/1==i)
        {
            // if (i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 9 != 0) 

            if (i % 2 != 0) {
                //  arr.append(i);

                System.out.println(i);

            }
        }
        //   arr3=arr2+arr;

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {

    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
