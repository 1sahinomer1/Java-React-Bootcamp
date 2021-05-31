package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void purchase(Gamer gamer, Game game);
	void saleWithCampaign(Game game, Campaign campaign);
}
