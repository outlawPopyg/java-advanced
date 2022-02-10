package streams;
import java.util.*;
import java.util.stream.Collectors;

class Student {
    int age;
    String name;
    int course;

    public Student(int age, String name, int course) {
        this.age = age;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

public class SortedMethod {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "Kalim", 1));
        list.add(new Student(19, "John", 2));
        list.add(new Student(18, "Arthur", 1));

        list = list.stream().sorted((student1, student2) -> student1.age - student2.age).collect(Collectors.toList());
        System.out.println(list);
        // => [Student{age=12, name='Kalim', course=1}, Student{age=18, name='Arthur', course=1}, Student{age=19, name='John', course=2}]
    }
}
