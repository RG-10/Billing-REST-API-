package pk.com.edu.uog.BillingServiceAPI.Services.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity(name = "order_table")
@Table(name = "order_table")
public class Order implements Serializable{

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	 
	    @Column(name = "id", nullable = false)
	    private Long id;

	    @JoinColumn(name = "customer_id", referencedColumnName = "id")
	    @ManyToOne(fetch = FetchType.LAZY)
	    private Customer customer;

	    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	    @JoinColumn(name = "order_table_id")
	    private List<OrderDetails> orderDetailList;

	    @Column(name="warranty")
	    private int warranty;

	    @Column(name = "comment", length = 150)
	    private String comment;
	    @Column(name="status")
	    private int status;

	    @Column(name = "created_at")
	    @DateTimeFormat(pattern = "dd-MM-yyyy")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date createdAt;

	    public Order() {
	        orderDetailList =new ArrayList<>();
	    }

	    @PrePersist
	    private void prePersist(){

	        createdAt=new Date();
	    }
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }

	    public String getComment() {
	        return comment;
	    }

	    public void setComment(String comment) {
	        this.comment = comment;
	    }

	    public int getWarranty() {
	        return warranty;
	    }

	    public void setWarranty(int warranty) {
	        this.warranty = warranty;
	    }

	    public Date getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(Date createdAt) {
	        this.createdAt = createdAt;
	    }

	    public void addItem(OrderDetails item) {
	        this.orderDetailList.add(item);
	    }


	    public List<OrderDetails> getOrderDetailList() {
	        return orderDetailList;
	    }

	    @JsonIgnore
	    public Double getTotal(){
	        double total=0D;
	        for (OrderDetails detail: orderDetailList) {
	            total+=detail.getUnit()*detail.getPrice();
	        }
	        return total;
	    }

	    public int getStatus() {
	        return status;
	    }

	    public void setStatus(int status) {
	        this.status = status;
	    }}
