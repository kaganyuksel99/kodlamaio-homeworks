package fiftDayHomework.dataAccess.concretes;

import fiftDayHomework.dataAccess.abstracts.UserDao;
import fiftDayHomework.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<User>();

    @Override
    public void login(User user) {
        System.out.println(user.getFirstName() + " "+ user.getLastName() + " " + "sisteme Hibernate ile giriş yaptı.");
    }

    @Override
    public void register(User user) {
        users.add(user);
        System.out.println(user.getFirstName() + " "+ user.getLastName() + " " + "sisteme Hibernate ile kayıt oldu");
    }

    @Override
    public void update(User user) {
        User updatedUser =getUser(user.getId());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setPassword(user.getPassword());
        System.out.println("Hibernate ile güncelleme işlemi tamamlandı.");

    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println(user.getFirstName() +" "+ user.getLastName()+" hibernate İle sistemden başarıyla silindi.");
    }

    @Override
    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserMail(String mail) {
        for (User user : users) {
            if (user.getEmail() == mail){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
