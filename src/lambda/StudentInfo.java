package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student(20, 'm');
        Student s2 = new Student(18, 'f');
        Student s3 = new Student(19, 'm');

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        checkStudents(al, new CheckOverAge()); // ВАРИАНТ #1
        System.out.println('\n');
        checkStudents(al, new StudentChecks() { // ВАРИАНТ #2 ( Anonymous class )
            @Override
            public boolean check(Student s) {
                return s.age > 10;
            }
        });
        System.out.println('\n');
        checkStudents(al, (Student s) -> s.age > 10); // ВАРИАНТ #3 ( Lambda-expressions )
        System.out.println('\n');

        // Пример с сортировкой(по возрасту)

        Collections.sort(al, new Comparator<Student>() { // Пример с анонимным классом
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        });
        System.out.println(al);

        Collections.sort(al, (student1, student2) -> student1.age - student2.age); // Пример с лямбда-выражением
        System.out.println(al);
    }

    public static void checkStudents(ArrayList<Student> arrayList, StudentChecks sc) {
        for (Student s : arrayList) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

interface StudentChecks { // Функциональный интерфейс. Должен содержать только один абстрактный метод
    boolean check(Student s);
}

class CheckOverAge implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.age > 10;
    }
}

