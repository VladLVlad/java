package lesson12.practice.practice1;

public class PrintableDemo {

    static Printable[] printable_s = {
            () -> System.out.println("Print printable"),
            new Book("Book1"),
            new Magazine("Magazine1"),
            new Magazine("Magazine2"),
            new Book("Book2"),
            new Book("Book3"),
            new Magazine("Magazine3")
    };

    public static void main(String[] args) {



        /*for (Printable printable:
             printable_s) {
            printable.print();
        }

        printMagazines(printable_s);
        printBook(printable_s);
*/

        Printable printable = PrintableDemo::printBook2;
        System.out.println(printable);
    }

    private static void printBook2() {
        for (Printable p:
                printable_s) {
            if(p instanceof Book book){
                System.out.println(book.getName());
            }
        }
    }
}
