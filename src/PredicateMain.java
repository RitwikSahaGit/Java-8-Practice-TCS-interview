import javax.swing.*;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {

        //predicate only gives true or false value
        Predicate<String> p1 = s -> s.length()>5;
        Predicate<String> p2 = i->i.length()>5;
        System.out.println(p2.and(p1).test("Ritwik"));
//        Predicate<String> predicate = s -> s.length()>5;
//        System.out.println(predicate.test("hello1"));
//
//        Predicate<Integer> predicate1 = x->x>18;
//        System.out.println(predicate1.test(20));
//
//        Predicate<Student> stu = student -> student.getId()>5;
//        Student student1 = new Student("kelo", 1);
//        System.out.println(stu.test(student1));

        Predicate<String> start = str -> str.toLowerCase().charAt(0)=='r';
        Predicate<String> end = str -> str.toLowerCase().charAt(str.length()-1)=='a';
        Predicate<String> and = start.and(end);
        System.out.println(and.test("Ritwik"));
        System.out.println(start.and(end).test("Ritwik"));//Same as previous line

        Predicate<String> or = start.or(end);
        System.out.println(or.test("Ritwik"));
        System.out.println(start.or(end).test("Ritwik"));//Same as previous line


    }
}
