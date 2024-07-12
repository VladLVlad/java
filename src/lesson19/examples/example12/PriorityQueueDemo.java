package lesson19.examples.example12;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Comparator<Book> comparator = Comparator.comparing(Book::getCountPages).thenComparing(Book::getName);
        Queue<Book> books = new PriorityQueue<>(comparator);
        books.offer(new Book("Ccvw", "Author1", 28));
        books.offer(new Book("Bcvw", "Author1", 32));
        books.offer(new Book("Acvw", "Author1", 32));
        books.offer(new Book("Ncvw", "Author1", 25));

        while (books.size() > 0){
            System.out.println(books.poll());
        }
    }
}
