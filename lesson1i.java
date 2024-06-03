
// Поиск простого числа
public class lesson1i {

    // class Answer {
    public static void printPrimeNums() {

        // Напишите свое решение ниже
        // Логика - используем 2 цикла - внешний идет от 2 до 1000
        // внутренний идет от 1 до "<" счётчика 1 го цикла - i - (j < i)
        // во внешнем цикле обьявляем переменную count =0 - которая будет обнулять значение с4етчика - count
        // во внутреннем цикле, в условии добавляем условие выхода из цикла
        // count<2- ( && count < 2;)
        // в теле вутреннего цикла пишем условие - проверку - если зна4ение счетчика внешнего цикла- 
        // делится без остатка на зна4ение с4етчика внутреннего цикла - i % j ==0 - то увеличиваем 
        // значение переменной count на один count++ - 
        // в итоге - при каждой операции деления проверяемого числа с4етчик будет увеличиваться,
        //  и если проверяемое число будет делиться больше 1 раза - зна4ит ето составное число , а не простое,
        // Далее во внешнем цикле добавляем условие- выведи все те числа, с4ечик деления - count- которых равен единице ==1
        // if(count==1){system.out.println(i);}
        // затем выполнение к первой строчке внешнего цикла, где переменная count - обнуляется - (int count = 0;), 
        // чтобы снова подсчитывать количество делений нового числа 
// 
        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);
        for (int i = 2; i < 1000000; i++) {
            int count = 0;

            // for (int j = 1; j < i && count < 2; j++) {
            for (int j = 1; j < i && count < 2 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0; j++) {
                if (i % j == 0) {

                    // System.out.printf("Novoe 4islo : ");
                    // System.out.println(i);
                    // System.out.printf("S4et4ik 4isla : ");
                    count++;
                    // System.out.println(count);
                }
            }
            if (count == 1) {
                // System.out.printf("Prostoe 4islo : ");
                System.out.println(i);
            }
        }
    }

    // }
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    // public class Printer {
    public static void main(String[] args) {

        printPrimeNums();

        // Answer ans = new Answer();
        // ans.printPrimeNums();
    }
}

// }
