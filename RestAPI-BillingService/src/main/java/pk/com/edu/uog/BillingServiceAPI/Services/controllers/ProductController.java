package pk.com.edu.uog.BillingServiceAPI.Services.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import pk.com.edu.uog.BillingServiceAPI.Services.entities.Product;
import pk.com.edu.uog.BillingServiceAPI.Services.services.IProductService;



@RestController
@RequestMapping("products")
public class ProductController {
	
	
	 @Autowired
	    private IProductService productService;
          
	 
	 
	    @SuppressWarnings({ "rawtypes", "unchecked" })
	    
		@ApiOperation(value = "create a product", response = ResponseEntity.class)
	    
	    @PostMapping("/create")
	    
	    @ResponseBody
	    public ResponseEntity createProduct(@RequestBody Product body){
	    	
	        if(body!=null) {
	        	
	            productService.createProduct(body);
	            
	            return new ResponseEntity("Congratulations Product is created successfully",HttpStatus.CREATED);
	          }
	            return new ResponseEntity(HttpStatus.OK);
	          }

	    @SuppressWarnings({ "rawtypes", "unchecked" })
	    
		@ApiOperation(value = "update a product", response = ResponseEntity.class)
	    
	    @PutMapping(value = "/update")
	    
	    @ResponseBody
	    public ResponseEntity updateProduct(@RequestBody Product body){
	    	
	        if(productService.updateProduct(body)) {
	        	
	            return new ResponseEntity("Congratulations Product is updated successsfully", HttpStatus.OK);
	        }
	            return new ResponseEntity(HttpStatus.ACCEPTED);
	        }

	    @ApiOperation(value = "View a list of Products", response = List.class)
	    
	    @GetMapping
	    public List<Product> getAllProducts(){
	    	
	        return productService.getAllProducts();
	    }

}
