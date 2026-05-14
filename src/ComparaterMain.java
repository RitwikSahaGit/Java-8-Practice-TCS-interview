
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparaterMain {
    public static void main(String[] args) {

        //Comparator only sorts the data

        List<Integer> list = Arrays.asList(5,4,5,7,8,2,1);
        Collections.sort(list, (Integer a , Integer b)->b-a);
        System.out.println(list);



        Student student = new Student("Ritwik", 1);
        Student student2 = new Student("Lalu", 2);
        Student student3 = new Student("Supratim", 3);

        List<Student> students = Arrays.asList(student,student2,student3);
//        students.add(student);
//        students.add(student2);
//        students.add(student3);

        Collections.sort(students, (Student a,Student b)->b.id - a.id);
        System.out.println(students);

    }
}
