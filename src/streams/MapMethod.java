package streams;
import java.util.*;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {

        // Метод map:

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("My name is Kalim");

        List<Integer> list2 = list.stream().map(elem -> elem.length()).collect(Collectors.toList());
        System.out.println(list2); // => [5,5,16]

        // Как из обычного массива получить stream:

        int[] array = {5, 9, 10, 30};
        array = Arrays.stream(array).map(el -> el*2).toArray();
        System.out.println(Arrays.toString(array)); // [10,18,20,60]


        // Как из Set получить stream

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("world");
        set.add("My name is Kalim");

        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set2); // [16,5]

    }
}
