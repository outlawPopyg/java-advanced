package generics;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Claim");
        list.add("John");
        list.add("Dutch");
        list.add("Micah");

        for (String n : list) {
            System.out.println(n);
        }

    }
}
