package main.java.by.bsuir.wt.mihalkov.tasks.fourth.controller.command.common;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.controller.command.Command;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.controller.command.CommandResult;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartPageCommand implements Command {

    private static final String LOGIN_PAGE = "/index.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
