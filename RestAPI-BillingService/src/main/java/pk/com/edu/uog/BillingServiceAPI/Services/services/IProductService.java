package pk.com.edu.uog.BillingServiceAPI.Services.services;

import java.util.List;

import pk.com.edu.uog.BillingServiceAPI.Services.entities.Product;



public interface IProductService {
    void createProduct(Product product);
    boolean updateProduct(Product product);
    List<Product> getAllProducts();
}