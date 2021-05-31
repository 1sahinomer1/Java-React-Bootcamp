package Concretes;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game successfully added." + game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game successfully deleted." + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game successfully updated." + game.getGameName());
		
	}

}
