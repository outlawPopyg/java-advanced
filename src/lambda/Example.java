package lambda;

public class Example {
    public static void def(I i) {
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        def((String s) -> s.length());
    }

}


interface I { // Функциональный интерфейс
    int abc(String s);
}