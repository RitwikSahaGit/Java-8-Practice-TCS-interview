//@FunctionalInterface
public interface Employee {
    String getSalary();

    static void staticMethod(){
        System.out.println("Inside staticMethod");
    }

    default void defaultMethod(){
        System.out.println("defaultMethod");
    }
}
