package objectFundamentals.business.concretes;

import objectFundamentals.business.abstracts.SaleService;
import objectFundamentals.entity.concretes.Campaign;
import objectFundamentals.entity.concretes.Game;
import objectFundamentals.entity.concretes.User;

public class SaleManager implements SaleService {
    @Override
    public void sell(User user, Campaign campaign, Game game) {
        double gamePrice = game.getPrice();
        double campaigneDiscountPercent = campaign.getDiscount();

        double price = gamePrice - (gamePrice * (campaigneDiscountPercent / 100));
        game.setPrice(price);

        System.out.println(user.getFirstName() + " adlı kullanıcıya " + game.getGameName() +
                " oyunu " + game.getPrice() + " fiyatla satıldı." );
    }

    @Override
    public void sell(User user, Game game) {
        System.out.println(user.getFirstName() + " adlı kullanıcıya " + game.getGameName() +
                " oyunu " + game.getPrice() + " fiyatla satıldı." );

    }
}
