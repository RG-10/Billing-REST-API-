package pk.com.edu.uog.BillingServiceAPI.Services.services;

import java.util.Date;
import java.util.List;

import pk.com.edu.uog.BillingServiceAPI.Services.entities.Order;



public interface IOrderService {
	
	 Order placeOrder(Order order);
     List<javax.persistence.criteria.Order> getOrderByPeriod(Date startDate, Date endDate);
     
     
     List<javax.persistence.criteria.Order> findAll();
     
     
	javax.persistence.criteria.Order placeOrder(javax.persistence.criteria.Order order);
	




}
