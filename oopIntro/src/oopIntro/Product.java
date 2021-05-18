package oopIntro;

public class Product {
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	public Product() {
		System.out.println("Ben çalýþmýþam aðam");
	}
	public Product(int id,String name,double unitPrice,String detail) {
		this(); // parametre almayan constructoru çaðýrýyor
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	

	
	
}
