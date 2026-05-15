import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryMain {
    public static void main(String[] args) {

        Function<String, String> f1 = str-> str.toUpperCase();
        System.out.println(f1.apply("Ritwik"));

        //As the Both are STRING so we can use Unary operator

        UnaryOperator<String> u = str -> str.toUpperCase();
        System.out.println(u.apply("Ankita"));

        BiFunction<String, String, String> bF = (str1, str2) -> str1+str2;
        System.out.println(bF.apply("Ritwik", "Ankita"));

        BinaryOperator<String> bS = (str1, str2) -> str1+str2;
        System.out.println(bS.apply("Ankita", "Ritwik"));

    }
}
