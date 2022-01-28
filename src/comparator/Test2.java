package comparator;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Интерфейс Comparator используется для сравнения объектов, используя НЕ естественный порядок

public class Test2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 100, "Kalim", "Ahmetshin");
        Employee emp2 = new Employee(101, 300, "Ivan", "Petrov");
        Employee emp3 = new Employee(9, 9000, "Ivan", "Aleksandrov");
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list, new NameComparator()); // Если вдруг нам нужно сортировать не как обычно по id, а по именам
        System.out.println("After sorting \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    int salary;
    String name;
    String surname;

    public Employee(int id, int salary, String name, String surname) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) { // Как сортировать объекты по умолчанию (основной механизм сравнения)
        return this.id - anotherEmp.id;
    }
}


class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
