package pk.com.edu.uog.RestAPIServices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pk.com.edu.uog.RestAPIServices.entity.Product;
import pk.com.edu.uog.RestAPIServices.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	
	private ProductRepository repository;
	
	
	           /*This 1st two methods for POST 
	             No.1 Save Single object
	             No.2 Save List of Product Objects */

	    public Product saveProduct(Product product) {
	        return repository.save(product);
	    }

	    public List<Product> saveProducts(List<Product> products) {
	        return repository.saveAll(products);
	    }
	    
	    
	    
	          /* These Below 3 Methods are for GET
	           *  No.1 return all objects in DB
	           * No.2 return objects by ID
	           * No.3 return objects by NAME
	           */
	    
	    

	    public List<Product> getProducts() {
	        return repository.findAll();
	    }

	    public Product getProductById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Product getProductByName(String name) {
	        return repository.findByName(name);
	    }
	    
	    
	          /*
	           *  This is DELETE method by ID
	           */
	    

	    public String deleteProduct(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }
	    
	    
	    
	    
	    

	    public Product updateProduct(Product product) {
	    	
	        Product existingProduct = repository.findById(product.getId()).orElse(null);
	        
	        existingProduct.setName(product.getName());
	        
	        existingProduct.setQuantity(product.getQuantity());
	        
	        existingProduct.setPrice(product.getPrice());
	        
	        return repository.save(existingProduct);
	    }

		public Product getByisActive(String value) {
			// TODO Auto-generated method stub
			return null;
		}}
