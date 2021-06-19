package fiftDayHomework.business.abstracts;

public interface AuthService {
    void  register(int id, String firstName, String lastName, String email, String password);

    void login(String email, String password);

    void loginGoogle(String email);

    void register(String email);
}
