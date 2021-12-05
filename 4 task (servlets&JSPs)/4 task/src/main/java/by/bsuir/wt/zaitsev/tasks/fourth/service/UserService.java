package main.java.by.bsuir.wt.mihalkov.tasks.fourth.service;

import main.java.by.bsuir.wt.mihalkov.tasks.fourth.entity.User;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.RepositoryException;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.exception.ServiceException;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.repository.creator.RepositoryCreator;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.repository.impl.UserRepository;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.common.FindById;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.user.FindByUsername;
import main.java.by.bsuir.wt.mihalkov.tasks.fourth.specification.user.FindByUsernameAndPassword;

import java.util.Optional;

public class UserService {

    public Optional<User> findByUsernameAndPassword(String username, String password) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            return userRepository.query(new FindByUsernameAndPassword(username, password));
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public Optional<User> findById(Integer id) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            return userRepository.query(new FindById(id));
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public Optional<User> findByUsername(String username) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            return userRepository.query(new FindByUsername(username));
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public void signUpUser(Integer id, String username, String password) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            User user = new User(id, username, password);
            userRepository.save(user);
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

}
