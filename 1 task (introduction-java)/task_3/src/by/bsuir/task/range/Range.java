package by.bsuir.task.range;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterator<Double>, Iterable<Double> {
    private double current;
    private final double end;
    private final double step;

    public Range(double start, double end, double step) {
        current = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public boolean hasNext() {
        return current <= end;
    }

    @Override
    public Double next() {
        if (current > end) throw new NoSuchElementException("Range has no more elements");

        var temp = current;
        current += step;
        return temp;
    }

    @Override
    public Iterator<Double> iterator() {
        return this;
    }
}
