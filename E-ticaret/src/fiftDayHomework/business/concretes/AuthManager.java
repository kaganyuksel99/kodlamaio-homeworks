package fiftDayHomework.business.concretes;

import fiftDayHomework.business.abstracts.AuthService;
import fiftDayHomework.business.abstracts.UserService;
import fiftDayHomework.core.abstracts.AuthServiceAdapter;
import fiftDayHomework.core.concretes.EmailService;
import fiftDayHomework.entities.concretes.User;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AuthManager implements AuthService {
    private UserService userService;
    private AuthServiceAdapter authServiceAdapter;
    private EmailService emailService;

    public AuthManager(UserService userService, AuthServiceAdapter authServiceAdapter, EmailService emailService) {

        this.userService = userService;
        this.authServiceAdapter = authServiceAdapter;
        this.emailService = emailService;
    }

    @Override
    public void register(int id, String firstName, String lastName, String email, String password) {
        User registerUser = new User(id, firstName, lastName, email, password);
        if (!information(registerUser.getFirstName(), registerUser.getLastName(), registerUser.getEmail(), registerUser.getPassword())) {
            return;
        }
        if (!longName(registerUser.getFirstName(), registerUser.getLastName())) {
            return;
        } else if (!controlEmail(registerUser.getEmail())) {
            return;
        } else if (!receviedEmail(registerUser.getEmail())) {
            return;
        } else if (!passwordLength(registerUser.getPassword())) {
            return;
        } else {
            this.emailService.verificationMail(registerUser.getEmail());

            Scanner scanner = new Scanner(System.in);
            System.out.println("1234567890 size gönderilen doğrulama kodunuzdur.");
            String option = scanner.nextLine();

            if (this.emailService.isVerification(option)) {
                this.userService.register(registerUser);
            } else {
                System.out.println("Kayıt işlemi başarısız. Tekrar deneyiniz");
            }

        }
    }

    private boolean information(String firstName, String lastName, String email, String password) {
        if (firstName.length() > 0 && lastName.length() > 0 && email.length() > 0 && password.length() > 0) {
            return true;
        } else {
            System.out.println("Kullanıcı bilgileri boş bırakılamaz. Lütfen belirtilen ölçütlerdi doldurunuz");
            return false;
        }
    }

    private boolean longName(String firstName , String lastName) {
        if (firstName.length() >= 2 && lastName.length() >= 2) {
            return true;
        }
        System.out.println("Ad ve soyad en az 2 harften oluşmalıdır.");
        return false;

    }


    private boolean controlEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(email).matches()) {
            return true;
        } else {
            System.out.println("Girilen bilgi mail formatında değildir.");
            return false;
        }
    }

    private boolean receviedEmail(String email) {
        if (userService.getUserEmail(email) == null) {
            return true;
        } else {
            System.out.println("Bu email daha önce alınmış. Başka mail giriniz");
            return false;
        }
    }

    private  boolean passwordLength(String password) {
        if (password.length() >= 6) {
            return true;
        } else{
            System.out.println("Şifreniz kurallar gereği en az 6 haneden oluşmalıdır.");
            return false;
        }
    }



    @Override
    public void login(String email, String password) {
        User userLogin = userService.getUserEmail(email);
        if (userLogin == null) {
            System.out.println("Geçersiz kullanıcı girdiniz");
        } else if (email.length() <= 0 || password.length() <= 0) {
            System.out.println("Şifre  ve email alanları boş bırakılalamaz.");
        } else if (userLogin.getEmail() != email) {
            System.out.println("Email hatalı ya da eksik girdiniz");
        } else if (userLogin.getPassword() != password) {
            System.out.println("Şifreyi hatalı ya da eksik girdiniz");
        } else  {
            System.out.println("Giriş başarılı. Hoşgeldiniz" + " " + userLogin.getFirstName() + " " + userLogin.getLastName());
        }
    }

    @Override
    public void loginGoogle(String email) {
        authServiceAdapter.login(email);
    }

    @Override
    public void register(String email) {
        authServiceAdapter.register(email);
    }
}
