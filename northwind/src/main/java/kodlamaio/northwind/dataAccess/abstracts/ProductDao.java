package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

//jpa reposu verdigim veri tipi icin nesne icin  
// ana productu verdim ve primary key idimde integer
public interface ProductDao extends JpaRepository<Product, Integer>{
		
}
