package fiftDayHomework.dataAccess.abstracts;

import fiftDayHomework.entities.concretes.User;

import java.util.List;

public interface UserDao {
   void login(User user);
   void register(User user);
   void update(User user);
   void  delete(User user);
   User getUser(int id);
   User getUserMail(String mail);
   List<User> getAll();
}
