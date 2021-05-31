package Entities;

public class Game {
	private int id;
	private String gameName;
	private double salesPrice;
	
	public Game(int id, String gameName, double salesPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.salesPrice = salesPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	} 
	
	
}
