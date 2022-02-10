package streams;
import java.util.*;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(19);

        System.out.println(list.stream().filter(el -> el % 2 == 0).collect(Collectors.toList())); // [2,4]
    }
}
