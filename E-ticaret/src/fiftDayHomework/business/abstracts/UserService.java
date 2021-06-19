package fiftDayHomework.business.abstracts;

import fiftDayHomework.entities.concretes.User;

import java.util.List;

public interface UserService {
    void login(User user);
    void  register(User user);
    void update(User user);
    void  delete(User user);
    User getUser(int id);
    User getUserEmail(String email);
    List<User> getAll();
}
