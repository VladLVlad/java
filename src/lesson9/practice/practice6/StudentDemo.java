package lesson9.practice.practice6;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ivanov" , 2.6),
                new Student("Smirnov" , 5),
                new Aspirant("Sobolev" , 5),
                new Aspirant("Andre" , 4.1),
        };

        for (Student s:
             students) {
            System.out.println(s.getLastName() + " has scholarship " + s.getScholarship());
        }
    }
}
