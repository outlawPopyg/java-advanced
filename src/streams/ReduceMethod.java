package streams;
import java.util.*;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(-5);
        list.add(-4);

        int sum = list.stream().reduce(0, (result, currentElem) -> result + currentElem);
        System.out.println(sum); //=> 0

        List<String> list1 = new ArrayList<>();
        list1.add("My");
        list1.add("name");
        list1.add("is Kalim");
        String concat = list1.stream().reduce("", (res, cur) -> res + " " + cur);
        System.out.println(concat);
    }
}
