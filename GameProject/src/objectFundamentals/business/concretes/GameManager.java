package objectFundamentals.business.concretes;

import objectFundamentals.business.abstracts.GameService;
import objectFundamentals.entity.concretes.Game;

public class GameManager implements GameService {

    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + " adlı oyun sisteme eklendi");
    }
}
