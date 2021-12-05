package main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.user;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.entity.Role;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindByRole implements Specification {

    private final Role role;

    public FindByRole(Role role) {
        this.role = role;
    }

    @Override
    public String toSql() {
        return "WHERE role = ?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(role);
    }
}
