package generics;
import java.util.*;

public class Subtyping {
    public static void main(String[] args) {
        Parent p = new Child(); // так делать можно

//        List<Parent> list = new ArrayList<Child>(); так нельзя

//        List<Number> list = new ArrayList<Integer>();
//        list.add(18); окей, добавили тип инт
//        list.add(3.14); не окей, добавили дабл, который относится к классу Number, но не Integer

        X<Integer> p1 = new X<>(15); // ok
//      X<String> p1 = new X<>("Hello world"); // String не наследник Number
    }
}

class Parent {}

class Child extends Parent {}

class X<T extends Number> { // ограничиваем тип. Теперь можно указывать только наследников класса намбэр
    T value;

    public X(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}