package lesson9.practice.practice6;

public class Aspirant extends Student{

    private String scientificWork;

    public Aspirant(String lastName, double averageMark) {
        super(lastName, averageMark);
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        if (getAverageMark() == 5.0) {
            return 2500;
        }
        return 2200;
    }
}
