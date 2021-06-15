package objectFundamentals.business.concretes;

import objectFundamentals.business.abstracts.UserService;
import objectFundamentals.entity.concretes.User;
import objectFundamentals.services.FakeMernis;

public class UserManager implements UserService {
    @Override
    public void register(User user) {
        if (FakeMernis.validate(user.getIdentificationNumber())) {
            System.out.println(user.getFirstName() + " adlı kullanıcı sisteme kayıt oldu");
        } else  {
            System.out.println("Kayıt olunamadı");
        }
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı güncellendi.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı hesabı silindi.");
    }
}
