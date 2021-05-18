package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"lenovo v15",150000,"16gbram");

		
		Product product2 = new Product();
		
		product2.id=2;
		product2.name="Lenovo V16";
		product2.unitPrice=15000;
		product2.detail="16gb ram";
		
		Product product3 = new Product();
		
		product3.id=3;
		product3.name="Lenovo V17";
		product3.unitPrice=15000;
		product3.detail="16gb ram";
		
		Product[] products = {
				product1,product2,product3
		};
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
	}

}
