import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerMain {
    public static void main(String[] args) {
        Consumer<List<Integer>> listConsumer = list ->{
            for(int i : list){
                System.out.println(i);
            }
        };

//        listConsumer.accept(Arrays.asList(1,2,3,46));

        Consumer<List<Integer>> listConsumer2 = list ->{
            System.out.println();
            for(int i : list){
                System.out.println(i*i);
            }
        };

        listConsumer.andThen(listConsumer2).accept(Arrays.asList(2,3,4));
    }
}
