package oopIntro;

public class Product {
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	public Product() {
		System.out.println("Ben �al��m��am a�am");
	}
	public Product(int id,String name,double unitPrice,String detail) {
		this(); // parametre almayan constructoru �a��r�yor
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	

	
	
}
