package main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.room;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindAll implements Specification {

    @Override
    public String toSql() {
        return "";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
