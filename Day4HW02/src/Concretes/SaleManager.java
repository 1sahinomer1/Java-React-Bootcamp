package Concretes;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void purchase(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " adli oyuncu " + game.getGameName() + " adli oyunu " + game.getSalesPrice() + " TL fiyata satin aldi.");
		
	}

	@Override
	public void saleWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " adli oyunda %" + campaign.getCampaignDiscount() + " indirim var. Guncel fiyat " 
	+ (game.getSalesPrice()-(game.getSalesPrice() * campaign.getCampaignDiscount()/100)) + " TL");

		
	}

}
