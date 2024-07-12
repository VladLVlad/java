package lesson19.examples.example12;

public class Book {
    private String name;
    private String author;
    private int countPages;

    public Book(String name, String author, int countPages) {
        this.name = name;
        this.author = author;
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                ", author='" + author + '\'' +
                ", countPages=" + countPages +
                '}';
    }
}
