package by.bsuir.task.book.comparator;

import by.bsuir.task.book.Book;

import java.util.Comparator;

public class TitleBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
