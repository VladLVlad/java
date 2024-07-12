package lesson9.practice.practice4;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader[] readers = new Reader[]{new Reader("Ivanov I.I"),
                new Reader("Smirnov A.A."),
                new Reader("Sobolev V.V.")};

        readers[0].takeBook(2);
        readers[1].takeBook("Book1", "Book2", "Book3");
        readers[2].takeBook(new Book("Book 1", "Author 1")
                , new Book("Book 2", "Author 2")
                , new Book("Book 3", "Author 3")
                , new Book("Book 4", "Author 4"));

    }
}
