package lambda;
import java.util.*;

public class forEach {
    public static void main(String[] args) {
        List<String> al = List.of("Kalim", "Akhmetchin", "John", "Marston");
        al.forEach(el -> System.out.println(el)); // Вывод элементов
    }
}
