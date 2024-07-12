package lesson19.practice.practice8;

import java.util.ArrayList;
import java.util.List;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class StudentDemo {

    public static void printStudents(List<Student> students){
        students.forEach(System.out::println);
    }
    public static void printStudentsCourse(List<Student> students, int course){
        students.forEach(student -> {
            if (student.getCourse() == course){
                System.out.println(student);
            }
        });
    }

    public static List<Student> nextLevel(List<Student> students){
        List<Student> nextCourseStudents = new ArrayList<>();
        students.forEach(student -> {
            final int[] sum = {0};
            final int[] count = {0};
            double average;
            student.getMarks().forEach((s, i) -> {
                sum[0] += i;
                count[0]++;
            });
            average = sum[0] / count[0];
            if(average >= 3){
                student.setCourse(student.getCourse() + 1);
                nextCourseStudents.add(student);
            }
        });
        return nextCourseStudents;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Name1", "123",  1, ofEntries(
                                entry("Subject1", 3),
                                entry("Subject2", 5),
                                entry("Subject3", 2),
                                entry("Subject4", 5)
                        )),
                        new Student("Name2", "123",  2, ofEntries(
                                entry("Subject1", 4),
                                entry("Subject2", 3),
                                entry("Subject3", 3),
                                entry("Subject4", 3)
                        )),
                        new Student("Name3", "123",  1, ofEntries(
                                entry("Subject1", 2),
                                entry("Subject2", 3),
                                entry("Subject3", 3),
                                entry("Subject4", 3)
                        ))
                )
        );
        printStudents(students);
        System.out.println("after checking:");
        students = nextLevel(students);
        printStudents(students);

    }
}
