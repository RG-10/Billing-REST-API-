package pk.com.edu.uog.RestAPIServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pk.com.edu.uog.RestAPIServices.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
        
	

	Product findByName(String name);
}
