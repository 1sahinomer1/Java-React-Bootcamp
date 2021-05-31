package Concretes;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService ;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void register(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Gamer successfully registered." + gamer.getFirstName());
		}else {
			System.out.println("Invalid a person.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer successfully deleted." + gamer.getFirstName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer successfully updated." + gamer.getFirstName());
	}

}
