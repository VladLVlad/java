package lesson19.examples.example14;

import java.util.Objects;

public class Book {
    private String name;
    private int countPages;

    public Book(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", countPages=" + countPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return countPages == book.countPages && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countPages);
    }
}
