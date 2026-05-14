import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

//       Demo demo = new Demo();
//       demo.employee.getSalary();
//       demo.employee2.getSalary();



        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(99);
        list.add(32);
        list.add(51);

        System.out.println(list);
        Collections.sort(list, (a,b)->b-a);
        System.out.println(list);


    }
}