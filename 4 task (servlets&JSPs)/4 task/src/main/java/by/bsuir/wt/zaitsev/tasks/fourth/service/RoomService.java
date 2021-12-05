package main.java.by.bsuir.wt.mihalkov.tasks.fourth.service;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.entity.Room;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.RepositoryException;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.ServiceException;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.repository.creator.RepositoryCreator;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.repository.impl.RoomRepository;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.common.FindById;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.room.FindAll;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.room.FindFree;

import java.util.List;
import java.util.Optional;

public class RoomService {

    public List<Room> findAll() throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            RoomRepository roomRepository = repositoryCreator.getRoomRepository();
            return roomRepository.queryAll(new FindAll());
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public List<Room> findFree() throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            RoomRepository roomRepository = repositoryCreator.getRoomRepository();
            return roomRepository.queryAll(new FindFree());
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public void saveRoom(Integer id, String roomNumber, Boolean occupied) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            RoomRepository roomRepository = repositoryCreator.getRoomRepository();
            Room room = new Room(id, roomNumber, occupied);
            roomRepository.save(room);
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public void changeStatus(Integer id, Boolean occupied) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            RoomRepository roomRepository = repositoryCreator.getRoomRepository();
            Optional<Room> room = roomRepository.query(new FindById(id));
            if (room.isPresent()) {
                room.get().setOccupied(occupied);
                roomRepository.save(room.get());
            } else {
                throw new ServiceException("No such room id");
            }
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }
}
