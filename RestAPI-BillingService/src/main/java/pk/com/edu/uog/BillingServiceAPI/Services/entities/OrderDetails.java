package pk.com.edu.uog.BillingServiceAPI.Services.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "order_detail")
public class OrderDetails {
	
	
	 @SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    
	    @Column(name = "id", nullable = false)
	    private Long id;
	    @JsonIgnore
	    
	    @JoinColumn( name = "order_table_id", referencedColumnName = "id")
	    @ManyToOne
	    
	    private Order order;
	    @JsonIgnore
	    
	    @JoinColumn(name = "product_id", referencedColumnName = "id")
	    @ManyToOne
	    
	    private Product product;
	    
	    private int unit;
	    
	    private double price;
	    
	    

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Order getOrder() {
	        return order;
	    }

	    public void setOrder(Order order) {
	        this.order = order;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }

	    public int getUnit() {
	        return unit;
	    }

	    public void setUnit(int unit) {
	        this.unit = unit;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	    }
