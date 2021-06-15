package objectFundamentals;
import objectFundamentals.business.concretes.CampaigneManager;
import objectFundamentals.business.concretes.GameManager;
import objectFundamentals.business.concretes.SaleManager;
import objectFundamentals.business.concretes.UserManager;
import objectFundamentals.entity.concretes.Campaign;
import objectFundamentals.entity.concretes.Game;
import objectFundamentals.entity.concretes.User;
public class Main {

    public static void main(String[] args) {
        User people = new User(1,"Kağan", "Yüksel", "59", "12345678911");

        Game games = new Game(1, "Legue of Legens", 5, "Strategy");

        Campaign campaign = new Campaign(1, "Öğrenci indirimi", 10 );




        UserManager userManager = new UserManager();
        GameManager gameManager = new GameManager();
        CampaigneManager campaigneManager = new CampaigneManager();
        SaleManager saleManager = new SaleManager();

        // kullanıcı ekleme - silme - güncelleme
        campaigneManager.add(campaign);
        campaigneManager.update(campaign);
        campaigneManager.delete(campaign);

        // Oyun ekleme
        gameManager.add(games);

        // Oyun satış işlemleri
        saleManager.sell(people , games); // indirimsiz satış
        saleManager.sell(people, campaign , games); // indirimli satış

    }
}
