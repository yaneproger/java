
// Задан массив, например, nums = [1,7,3,6,5,6]. 
// Написать программу, которая найдет индекс i для этого массива такой, 
// что сумма элементов с индексами < i равна сумме элементов с индексами > i. 
public class lesson031024 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 7, 3, 6, 5, 6};
        int summ = 0;
        int summ1 = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j <= 0; j--) {

                summ = summ + arr[i];
                summ1 = summ1 + arr[j];

                if (summ == summ1) {
                    index = i;

                }
            }

        }
        // System.out.println(j);
        System.out.println(summ);
        System.out.println(summ1);
        System.out.println(index);

    }

}
