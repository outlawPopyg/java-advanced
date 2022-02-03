package generics;
import java.util.*;

public class WIldcard {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("fsfe");

        showListInfo(list1);


        List<?> list2 = new ArrayList<String>();
//        list2.add("Hello"); Ошибка, мы не можем вызывать методы, которые меняют объект, когда указан <?>

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(sum(l1));


    }

    public static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    public static double sum(ArrayList<? extends Number> arrayList ) {
        double res = 0;
        for (Number i : arrayList) {
            res += i.doubleValue();
        }
        return res;
    }
}


