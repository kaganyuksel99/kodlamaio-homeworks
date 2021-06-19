package fiftDayHomework.core.concretes;

public class EmailManager implements  EmailService{
    @Override
    public void verificationMail(String email) {
        System.out.println(email + " "+ "Mail adresinize doğrulama maili gönderilmiştir.");
    }

    @Override
    public boolean isVerification(String option) {
        if (option.equals("1234567890")){
            System.out.println("Email doğrulaması tamamlanmıştır.");
            return true;
        }
        System.out.println("Email doğrulaması tamamlanamadı.");
        return false;
    }

}
