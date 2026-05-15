import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> 10; //just to hold the data
        Predicate<Integer> predicate = x->x%2==0; //to test TRUE or FALSE
        Function<Integer, Integer> function = x->x*x; //Does Some job and return SOMETHING
        Consumer<Integer> consumer = x-> System.out.println(x); //Only does job returns NOTHING

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
    }
}
