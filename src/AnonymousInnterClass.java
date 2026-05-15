public class AnonymousInnterClass {
    public static void main(String[] args) {


        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "10000";
            }
        };

        System.out.println(employee.getSalary());

        //Same thing with lambda
        Employee employee2 = ()-> "9999999";
        System.out.println(employee2.getSalary());

    }
}
