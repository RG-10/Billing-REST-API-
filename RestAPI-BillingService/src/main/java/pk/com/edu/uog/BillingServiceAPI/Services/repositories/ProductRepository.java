package pk.com.edu.uog.BillingServiceAPI.Services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pk.com.edu.uog.BillingServiceAPI.Services.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
