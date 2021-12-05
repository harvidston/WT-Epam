package main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
