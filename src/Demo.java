public class Demo {
    int b = 9;
    Employee employee = new Employee() {
        int a=2;
        @Override
        public String getSalary() {
            System.out.println(this.a);
            return "10";
        }
    };


    public void doSomething(){
        int a = 10;
        Employee employee2 = () -> {
            b=5;
            System.out.println(a);
            return "10";
        };

    }


}
