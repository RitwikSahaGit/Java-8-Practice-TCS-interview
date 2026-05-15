import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
//        Function<String, Integer> fun= s->s.length();
//        System.out.println(fun.apply("abc"));


//        Function<String, String> func = str -> str.substring(0,3).toLowerCase();
//        //System.out.println(func.apply("Ritwik"));
//
//        Student student = new Student("Ritwik", 1);
//        Student student2 = new Student("Lalu", 2);
//        Student student3 = new Student("Ritam", 3);
//
//        List<Student> students = Arrays.asList(student,student2,student3);
//        List<Student> filteredStudents=new ArrayList<>();
//
//        Function<List<Student>, List<Student>> filter =  stu -> {
//            for(Student s: stu){
//               if(s.getName().substring(0,3).equalsIgnoreCase("rit")){
//                   filteredStudents.add(s);
//               }
//            }
//            return filteredStudents;
//        };
//
//        //List<Student> filteredStudents2=filter.apply(students);
//        System.out.println(filter.apply(students));
//
        Function<Integer, Integer> func1 = x -> x+1;
        Function<Integer, Integer> func2 = x -> x*x;

        System.out.println(func1.andThen(func2).apply(2));
        System.out.println(func2.andThen(func1).apply(2));
//
//        Function<Integer, Integer> func3 = func1.andThen(func2);

    }
}
