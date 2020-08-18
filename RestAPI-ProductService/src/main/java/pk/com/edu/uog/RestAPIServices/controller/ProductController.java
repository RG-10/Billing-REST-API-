package pk.com.edu.uog.RestAPIServices.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pk.com.edu.uog.RestAPIServices.entity.Product;
import pk.com.edu.uog.RestAPIServices.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	      /*
	       * This is POST Mapping for single and List of Products
	       */
	
	@PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }
    
    
    
         /*
          *  This is GET Mapping for getting product by ID,Name and List  
          */
    
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }
    
    @GetMapping("/getAllActiveproducts/{value}")
    public Product findProductByValue (@PathVariable String value) {
    	return service.getByisActive(value);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }
         
         /*
          * This is for Updating the Product
          */

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }
    
         /*
          * This is for Deleting the existing Product
          */

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }     
    
    
    
    
    
    
    
    
    
}
