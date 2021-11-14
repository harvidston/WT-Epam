package by.bsuir.task.isbn;

public class Isbn implements Comparable<Isbn> {
    private final int underlyingNumber;

    public Isbn(String number) {
        underlyingNumber = Integer.parseInt(number.replaceAll("-", ""));
    }


    @Override
    public int compareTo(Isbn o) {
        return underlyingNumber - o.underlyingNumber;
    }
}
