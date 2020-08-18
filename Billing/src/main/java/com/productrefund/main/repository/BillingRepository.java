package com.productrefund.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productrefund.main.entity.Billing;


public interface BillingRepository extends JpaRepository<Billing, Integer> {

	Billing findByName(String name);
	public List<Billing> findBybillingIsActive(boolean billingIsActive);
	static void deleteBillById(int id) {
		
		
	}

}
