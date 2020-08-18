package pk.com.edu.uog.BillingServiceAPI.Services.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pk.com.edu.uog.BillingServiceAPI.Services.entities.Product;
import pk.com.edu.uog.BillingServiceAPI.Services.repositories.ProductRepository;





@Service
public abstract class ProductServiceImpl  implements IProductService {
	
	 @Autowired
	    private ProductRepository repository;
	 
	 
	 @Override
	    public void createProduct(Product product) {
	        if(product!=null){
	            repository.save(product);
	        }
	    }

	    @Override
	    public boolean updateProduct(Product product) {
	        if(product!=null && product.getId()!=null){
	            repository.save(product);
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public List<Product> getAllProducts() {
	        return repository.findAll();
	    }

}
