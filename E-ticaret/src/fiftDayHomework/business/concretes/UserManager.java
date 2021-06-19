package fiftDayHomework.business.concretes;

import fiftDayHomework.business.abstracts.UserService;
import fiftDayHomework.dataAccess.abstracts.UserDao;
import fiftDayHomework.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void login(User user) {
        userDao.login(user);
    }

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public User getUserEmail(String email) {
        return userDao.getUserMail(email);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
