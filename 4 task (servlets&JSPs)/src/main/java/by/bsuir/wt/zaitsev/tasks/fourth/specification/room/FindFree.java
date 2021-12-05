package main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.room;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindFree implements Specification {

    public FindFree() {
    }

    @Override
    public String toSql() {
        return "WHERE occupied = 'false'";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
