package lambda;
import java.util.ArrayList;
import java.util.function.*;

public class UtilFunction {

    // Встроенный функциональный интерфейс Predicate<T> -------------------------------

    public static void checkStudents(ArrayList<Student> al, Predicate<Student> p) {
        for (Student s : al) {
            if (p.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(20, 'm');
        Student s2 = new Student(18, 'f');
        Student s3 = new Student(19, 'm');

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        checkStudents(al, student -> student.sex == 'm');

        // Метод removeIf у ArrayList --------------------------------

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kalim");
        arrayList.add("John");
        arrayList.add("Hello world");
        arrayList.add("Hello");

        arrayList.removeIf(element -> element.length() > 5); // удаляем эл-ты длина которых больше 5
        System.out.println(arrayList); // => [Kalim, John, Hello]

        // или так ...
        arrayList.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });
        System.out.println(arrayList); // => [Kalim, John, Hello]

        // Методы and, or ----------------------------------------

        Predicate<Student> p1 = student -> student.sex == 'm';
        Predicate<Student> p2 = student -> student.age > 18;

        checkStudents(al, p1.and(p2));
        // => Student{age=20, sex=m}
        //    Student{age=19, sex=m}

    }

}
