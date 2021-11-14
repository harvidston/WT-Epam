package by.bsuir.task.book;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    protected ProgrammerBook(Book other) {
        super(other);
    }

    @Override
    public String toString() {
        return language + " of level " + level + "; " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook book = (ProgrammerBook) o;
        return level == book.level && language.equals(book.language);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash += 31 * language.hashCode();
        hash += 31 * level;
        return hash;
    }
}
