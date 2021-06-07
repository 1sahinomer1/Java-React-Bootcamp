package nLayerdDemo.dataAccess.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductDao {
		void add(Product product);
		void update(Product product);
		void delete(Product product);
		Product get(int id); // Product dondurur cunku arama yapiyoruz ve id ye sahip urun ekrana getirilir
		List<Product> getAll(); //Dizi kullanýrsak en basta array boyutu belirlendigi icin bu sekilde kullanmak daha dogru bir liste dondurecek product tipinde ve fonksiyonun adi getall
		
 }
