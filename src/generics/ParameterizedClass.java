package generics;
import java.util.*;

public class ParameterizedClass {
    public static void main(String[] args) {
        TypedClass<Integer> t1 = new TypedClass<>(123);
        System.out.println(t1.getValue());

        TypedClass<String> t2 = new TypedClass<>("Hello world");
        System.out.println(t2.getValue());
    }
}


class TypedClass<T> {
    T value;

    public TypedClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
