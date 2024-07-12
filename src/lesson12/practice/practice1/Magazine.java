package lesson12.practice.practice1;

public class Magazine implements Printable{

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable_s){
        for (Printable p:
             printable_s) {
            if(p instanceof Magazine magazine){
                System.out.println(magazine.getName());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print magazine " + getName());
    }
}
