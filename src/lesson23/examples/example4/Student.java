package lesson23.examples.example4;

public class Student implements Cloneable{
    private String name;
    private Group group;

    public Student(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public Student(Student otherStudent) throws CloneNotSupportedException{
        this(otherStudent.getName(), otherStudent.getGroup().clone());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Name: " + name + ",  group: " + group.getName() +
                ", course: " + group.getCourse();
    }

    @Override
    public Student clone() throws CloneNotSupportedException{

            Student student = (Student) super.clone();
            Group group = student.getGroup().clone();
            student.setGroup(group);
            return student;

    }
}
