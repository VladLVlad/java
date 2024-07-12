package lesson19.examples.example14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Name1", 35),
                new Book("Name2", 65),
                new Book("Name3", 21),
                new Book("Name4", 70),
                new Book("Name5", 61),
                new Book("Name6", 11)
        ));
        List<Book> bigBooks = new ArrayList<>(10);
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if(book.getCountPages() > 50){
                bigBooks.add(book);
                iterator.remove();
            }
        }
        System.out.println("books:");
        books.forEach(System.out::println);
        System.out.println("big books:");
        bigBooks.forEach(System.out::println);
    }
}
