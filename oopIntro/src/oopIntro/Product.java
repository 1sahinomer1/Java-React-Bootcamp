package oopIntro;

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	

	public Product(int id,String name,double unitPrice,String detail) {

		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	

	
	
}
