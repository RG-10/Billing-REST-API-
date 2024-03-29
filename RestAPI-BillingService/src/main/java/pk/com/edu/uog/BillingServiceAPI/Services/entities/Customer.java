package pk.com.edu.uog.BillingServiceAPI.Services.entities;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Customer implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    @Basic(optional = false)
	    @Column(name = "id", nullable = false)	
	    private Long id;
	    
	    @Column(name = "images", length = 255)
	    private String image;
	    
	    @Column(name = "name", length = 255)
	    private String name;
	   
	    @Column(name = "last_name", length = 50)
	    private String lastName;
	    
	    @Column(name = "company", length = 50)
	    private String company;
	    
	    @Column(name = "address", length = 50)
	    private String address;
	    
	    @Column(name = "phone", length = 50)
	    private String phone;
	    
	    @Column(name = "email", length = 50)
	    private String email;
	    
	    
	    @OneToMany(mappedBy ="customer" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = false)
	    private List<Order> orderEntities;
	    
	    
	    @Column(name = "created_at")
	    
	    @DateTimeFormat(pattern = "dd-MM-yyyy")
	    
	    @Temporal(TemporalType.TIMESTAMP)
	    
	    private Date createdAt;
	 

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

	    public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getCompany() {
	        return company;
	    }

	    public void setCompany(String company) {
	        this.company = company;
	    }


	    
		public String getAddress() {
			return address;
		}

		
		public void setAddress(String address) {
			this.address = address;
		}

		
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		
		public String getEmail() {
			return email;
		}

		
		public void setEmail(String email) {
			this.email = email;
		}

		public Date getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(Date createdAt) {
	        this.createdAt = createdAt;
	    }
	    
	    public String getFullName(){
	    return this.name.concat(" ").concat(this.lastName);
	    }


	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (id != null ? id.hashCode() : 0);
	        return hash;
	    }


	    @Override
	    public String toString() {
	    	
	        return "Customer{" +
	                "name='" + name + '\'' +
	                '}';
	    }
}
