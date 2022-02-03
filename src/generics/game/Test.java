package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar sc1 = new Schoolar("Ivan", 12);
        Schoolar sc2 = new Schoolar("Anton", 12);

        Student student1 = new Student("Kalim", 19);
        Student student2 = new Student("Gennadiy", 18);

        Employee employee1 = new Employee("John", 29);
        Employee employee2 = new Employee("Arthur", 35);

        Team<Schoolar> schoolarTeam = new Team<>("Школьники поганые");
        schoolarTeam.addNewParticipant(sc1);
        schoolarTeam.addNewParticipant(sc2);

        Team<Employee> employeeTeam = new Team<>("Работяги");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Student> studentTeam = new Team<>("Долбаебы");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Student> studentTeam2 = new Team<>("Долбаебы 2");

        studentTeam.playWith(studentTeam2);




    }
}
