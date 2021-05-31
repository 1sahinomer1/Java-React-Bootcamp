package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"lenovo v15",150000,"16gbram");

		
	
		
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
