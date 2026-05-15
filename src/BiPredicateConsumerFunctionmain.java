import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateConsumerFunctionmain {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bipredicate = (x,y) ->x%y==0;
        System.out.println(bipredicate.test(2,2));

        BiFunction<String, String, Integer> biFunction = (str1, str2) -> str1.length()+str2.length();
        System.out.println((biFunction.apply("Ritwik", "ankita")));

        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1+str2);
        biConsumer.accept("Ritwik ", "Ankita");

        

    }
}
