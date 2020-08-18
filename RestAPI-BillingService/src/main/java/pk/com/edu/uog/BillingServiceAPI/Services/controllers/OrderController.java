package pk.com.edu.uog.BillingServiceAPI.Services.controllers;

import java.util.List;


import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.annotations.ApiOperation;
import pk.com.edu.uog.BillingServiceAPI.Services.services.IOrderService;
import pk.com.edu.uog.BillingServiceAPI.Services.util.DateUtil;



@RestController
@RequestMapping("orders")
public class OrderController {
	
	
	 @Autowired
	    private IOrderService orderService;
        
	 
	 
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	@ApiOperation(value = "place a order", response = ResponseEntity.class)
	 
	    @PostMapping(value = "/create")
	 
	    @ResponseBody
	    public ResponseEntity placeOrder(@RequestBody Order body) {
		 
	        if(body!=null) {
	        	
	            System.out.println(body.getComment());
	            
	            System.out.println(body.getOrderDetailList().size());
	            
	            orderService.placeOrder(body);
	            
	            return new ResponseEntity("Congratulations Order is placed successfully", HttpStatus.CREATED);
	            
	        }
	    return new ResponseEntity(HttpStatus.OK);
	}

	    @ApiOperation(value = "View a list of order by paramiters", response = List.class)
	    
	    @GetMapping
	    
	    public List<Order> getOrderByPeriod(@RequestParam  String startDate, @RequestParam String endDate){
	    	
	        return orderService.getOrderByPeriod(DateUtil.stringToDate(startDate), DateUtil.stringToDate(endDate));
	    }


}
