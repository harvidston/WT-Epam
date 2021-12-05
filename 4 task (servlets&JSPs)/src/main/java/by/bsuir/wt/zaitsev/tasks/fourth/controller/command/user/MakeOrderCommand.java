package main.java.by.bsuir.wt.mihalkov.tasks.fourth.controller.command.user;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.controller.command.Command;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.controller.command.CommandResult;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.ServiceException;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrderCommand implements Command {

    private static final String MAIN_PAGE = "controller?command=mainPage";
    private static final String ROOM_ID = "roomId";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String roomId = request.getParameter(ROOM_ID);

        RoomService roomService = new RoomService();
        roomService.changeStatus(Integer.valueOf(roomId), true);

        return CommandResult.redirect(MAIN_PAGE);
    }
}
