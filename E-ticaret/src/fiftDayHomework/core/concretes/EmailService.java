package fiftDayHomework.core.concretes;

public interface EmailService {
    void verificationMail(String email);
    boolean isVerification(String email);
}
