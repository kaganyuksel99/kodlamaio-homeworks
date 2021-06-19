import fiftDayHomework.business.abstracts.AuthService;
import fiftDayHomework.business.concretes.AuthManager;
import fiftDayHomework.business.concretes.UserManager;
import fiftDayHomework.core.abstracts.AuthServiceManager;
import fiftDayHomework.core.concretes.EmailManager;
import fiftDayHomework.dataAccess.concretes.HibernateUserDao;

public class Main {

    public static void main(String[] args) {
        AuthService authService = new AuthManager(new UserManager(new HibernateUserDao()), new AuthServiceManager(), new EmailManager());
        System.out.println("Google entegresi için mail bilgisi:");
        String googleUserMail = "kaanyk07@gmail.com";
        authService.register(googleUserMail);
        authService.loginGoogle(googleUserMail);

        System.out.println("SİSTEME KAYIT OLMA VE GİRİŞ YAPMA İŞLEMLERİ"); //DOĞRU KAYIT OLMA VE GİRİŞ YAPMA
        authService.register(1,"Kağan", "Yüksel", "kaanyk07@gmail.com", "1234567890");
        authService.login("kaanyk07@gmail.com", "1234567890");

        // 2 haneden az isim ve şifre girişi
        authService.register(2,"K","Y", "kaanyk07@gmail.com","1234567890");
        // Boş alan bırakılması
        authService.register(3,"Kağan", "Yüksel", "", "123456790");
        // Email alanında email formatı dışında bilgi girilmesi
        authService.register(4,"Kağan","Yüksel","asdasdasd","1234567890");
        // 6 hane aşağısında şifre oluşturulması
        authService.register(5,"Kağan", "Yüksel", "kaanyk07@gmail.com","1");
        // Daha önceden alınmış email adresi ile kayıt olma
        authService.register(1,"Kağan", "Yüksel", "kaanyk07@gmail.com", "1234567890");

        System.out.println("SİSTEME GİRİŞ YAPMA");
        authService.login("kaanyk07@gmail.com", "1234567890");
        authService.login("","");
    }
}
