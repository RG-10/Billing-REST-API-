package pk.com.edu.uog.BillingServiceAPI.Services.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order>  findByCreatedAtBetween(Date startDate, Date endDate);
}