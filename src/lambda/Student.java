package lambda;

public class Student {
    int age;
    char sex;

    public Student(int age, char sex) {
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", sex=" + sex +
                '}';
    }
}
