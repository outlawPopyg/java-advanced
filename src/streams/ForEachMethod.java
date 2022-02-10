package streams;
import java.util.*;

public class ForEachMethod {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        Arrays.stream(array).forEach(el -> System.out.println(el)); // Можно так
        Arrays.stream(array).forEach(System.out::println); // Можно эдак

    }
}
