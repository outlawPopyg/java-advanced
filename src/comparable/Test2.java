package comparable;
import java.util.*;

// Интерфейс Comparable используется для сравнения объектов, используя естественный порядок

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
        Collections.sort(list);
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
    public int compareTo(Employee anotherEmp) { // сортировка по id
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }

//        return this.id - anotherEmp.id;  ===>  Можно и так

//        return this.name.compareTo(anotherEmp.name); ===> если сортируем по именам

        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }

        return res; // сначала сравниваем имена, если имена одинаковые то сравниваем фамилии
    }
}
