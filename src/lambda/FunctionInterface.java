package lambda;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class ExtendedStudent extends Student {
    double avgGrade;

    public ExtendedStudent(int age, char sex, double avgGrade) {
        super(age, sex);
        this.avgGrade = avgGrade;
    }
} // Студент, с добавленным атрибутом avgGrade

// Function<T,R> - принимает на вход один тип и возвращает другой

public class FunctionInterface {
    public static void main(String[] args) {
        ExtendedStudent s1 = new ExtendedStudent(20, 'm', 1);
        ExtendedStudent s2 = new ExtendedStudent(18, 'f', 1);
        ExtendedStudent s3 = new ExtendedStudent(19, 'm', 1);

        ArrayList<ExtendedStudent> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        System.out.println(avgOfSomething(al, student -> student.avgGrade));
        System.out.println(avgOfSomething(al, student -> (double)student.age));
        
    }


    public static double avgOfSomething(List<ExtendedStudent> list, Function<ExtendedStudent, Double> f) {
        double result = 0;
        for (ExtendedStudent student: list) {
            result += f.apply(student);
        }
        return result / list.size();
    }
}
