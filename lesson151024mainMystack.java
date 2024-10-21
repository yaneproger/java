
import java.util.LinkedList;

public class lesson151024mainMystack {

    public static void main(String[] args) {

        LinkedList myLL = new LinkedList<>();

        myLL.add();
        mystack stack01 = new mystack();
        System.out.println(stack01.size());
        System.out.println(stack01);
        stack01.push(1);
        stack01.push(2);
        stack01.push(1);
        stack01.push(1);
        System.out.println(stack01);
        stack01.pop();
        stack01.pop();
        System.out.println(stack01);
        System.out.println(stack01.peek());
        System.out.println(stack01.empty());
        stack01.pop();
        stack01.pop();
        System.out.println(stack01);
        System.out.println(stack01.size());
        System.out.println(stack01.empty());
        stack01.push(1);
        stack01.push(2);
        stack01.push(1);
        stack01.push(1);
        System.out.println(stack01);

    }

}
