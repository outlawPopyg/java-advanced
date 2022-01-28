package comparable;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kalim");
        list.add("Ivan");
        list.add("Zaur");
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }
    /*
        Before sorting
        [Kalim, Ivan, Zaur]

        After sorting
        [Ivan, Kalim, Zaur]
    */
}
