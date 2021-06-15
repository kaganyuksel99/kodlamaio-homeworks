package objectFundamentals.business.abstracts;

import objectFundamentals.entity.concretes.Campaign;
import objectFundamentals.entity.concretes.Game;
import objectFundamentals.entity.concretes.User;

public interface SaleService {
    void  sell(User user, Campaign campaign, Game game); // indirim yapılmış satış
    void  sell(User user, Game game); // indirim olmayan satış
}
