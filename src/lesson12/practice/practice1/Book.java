package lesson12.practice.practice1;

public class Book implements Printable{

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printBook(Printable[] printable_s){
        for (Printable p:
             printable_s) {
            if(p instanceof Book book){
                System.out.println(book.getName());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print book " + getName());
    }


}
