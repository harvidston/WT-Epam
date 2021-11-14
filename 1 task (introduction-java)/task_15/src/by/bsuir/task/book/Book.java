package by.bsuir.task.book;

import by.bsuir.task.isbn.Isbn;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private Isbn isbn;
    private static int edition;

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
