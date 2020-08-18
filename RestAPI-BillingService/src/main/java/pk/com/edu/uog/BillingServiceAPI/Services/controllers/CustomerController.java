package pk.com.edu.uog.BillingServiceAPI.Services.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.ApiOperation;
import pk.com.edu.uog.BillingServiceAPI.Services.entities.Customer;
import pk.com.edu.uog.BillingServiceAPI.Services.repositories.CustomerRepository;



@RestController
@RequestMapping("customers")
public class CustomerController {
	
	 @Autowired
	    private CustomerRepository customerRepository;
	 
	 @ApiOperation(value = "create a customer")
	    @PostMapping(value = "/create")
	    public void create(@RequestBody Customer body){
	        if(body==null){
	            return;
	        }
	        customerRepository.save(body);
	    }

	    @ApiOperation(value = "View a list of customers", response = List.class)
	    @GetMapping
	    public List<Customer> findAll(){
	        return customerRepository.findAll();
	    }

}
