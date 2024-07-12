package lesson23.examples.example4;

public class Group implements Cloneable{
    private String name;
    private int course;

    public Group(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Group clone() throws CloneNotSupportedException {
        return (Group) super.clone();
    }


}
