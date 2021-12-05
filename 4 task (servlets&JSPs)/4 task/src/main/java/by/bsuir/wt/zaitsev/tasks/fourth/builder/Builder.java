package main.java.by.bsuir.wt.mihalkov.tasks.fourth.builder;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
