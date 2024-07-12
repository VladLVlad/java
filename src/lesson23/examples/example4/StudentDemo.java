package lesson23.examples.example4;

public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student1 = new Student("Vlad", new Group("1234", 2));
        Student student2 = student1.clone();

        student1.setName("Igor");
        student2.getGroup().setCourse(3);

        System.out.println(student1);
        System.out.println(student2);

        Student student3 = new Student("Egor", new Group("4321", 1));
        Student student4 = new Student(student3);

        student3.setName("Nikita");
        student4.getGroup().setName("4322");

        System.out.println(student3);
        System.out.println(student4);
    }

}
