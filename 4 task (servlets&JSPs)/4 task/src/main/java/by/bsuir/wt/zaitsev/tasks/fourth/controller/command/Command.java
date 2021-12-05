package main.java.by.bsuir.wt.mihalkov.tasks.fourth.controller.command;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
