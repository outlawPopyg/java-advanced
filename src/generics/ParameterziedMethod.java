package generics;
import java.util.*;

public class ParameterziedMethod {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        // Как видит JVM: ArrayList list1 = new ArrayList();
        String o = list1.get(0);
        // Как видит JVM: String o = (String)list1.get(0);
        list1.add("John");
        list1.add("Dutch");

        String el1 = Parameterized.getSecondElement(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(55);

        int el2 = Parameterized.getSecondElement(list2);

        System.out.println(el1 + " " + el2);

    }
}

class Parameterized {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}

