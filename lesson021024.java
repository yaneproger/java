
public class lesson021024 {

    public static void main(String[] args) {

        String str = "Dobro pojalovat na kurs po Java";
        String[] array = str.split(" ");
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            String tmp = array[i];
            sb.append(tmp).append(" ");

        }
        System.out.println(sb);

    }
}
