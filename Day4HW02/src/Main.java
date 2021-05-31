import java.time.LocalDate;

import Abstract.GamerCheckService;
import Adapter.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
			Gamer gamer1 = new Gamer(1,"Ömer Faruk", "Þahin",LocalDate.of(1998,8,30),"11111111");
			
			GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());	
			gamerManager.register(gamer1);
			
			Game game1 = new Game(2, "CS 1.6", 10.0);
			
			GameManager gameManager = new GameManager();
			gameManager.add(game1);
			
			Campaign campaign = new Campaign(3, "fiftyFifty", 50);
			CampaignManager campaignManager = new CampaignManager();
			campaignManager.add(campaign);
			
			SaleManager saleManager = new SaleManager();
			saleManager.purchase(gamer1, game1);
			
			saleManager.saleWithCampaign(game1, campaign);
			
	}

}
