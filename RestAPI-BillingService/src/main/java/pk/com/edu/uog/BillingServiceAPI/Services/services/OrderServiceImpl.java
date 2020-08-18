package pk.com.edu.uog.BillingServiceAPI.Services.services;

import java.util.Date;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import pk.com.edu.uog.BillingServiceAPI.Services.repositories.OrderRepository;


@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Order placeOrder(Order order) {
        if(order !=null) {
          return repository.save(order);
        }
        return null;
    }

    @Override
    public List<Order> getOrderByPeriod(Date startDate, Date endDate) {
        System.out.println(startDate);
        System.out.println(endDate);
        if(startDate!=null && endDate!=null) {

            return repository.findByCreatedAtBetween(startDate, endDate);
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

	@Override
	public pk.com.edu.uog.BillingServiceAPI.Services.entities.Order placeOrder(
			pk.com.edu.uog.BillingServiceAPI.Services.entities.Order order) {
		// TODO Auto-generated method stub
		return null;
	}
}

