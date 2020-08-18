package com.productrefund.main.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productrefund.main.entity.Billing;
import com.productrefund.main.repository.BillingRepository;



@Service
public class BillingService {

	@Autowired
	private BillingRepository productrepo;

	public Billing saveBilling(Billing product) {
		return productrepo.save(product);
	}

	public List<Billing> saveBillings(List<Billing> products) {
		return productrepo.saveAll(products);
	}

	public List<Billing> getBillings() {
		return productrepo.findAll();
	}

	public Billing getBillingById(int id) {
		return productrepo.findById(id).orElse(null);
	}

	public Billing getBillingByName(String name) {
		return productrepo.findByName(name);
	}

	public String deleteBilling(int id) {
		productrepo.deleteById(id);
		return "Billing Deleted " + id;
	}

	public Billing updateBilling(Billing product) {
		Billing existingBilling = productrepo.findById(product.getId()).orElse(null);
		existingBilling.setAMOUNT(product.getAMOUNT());
		existingBilling.setCARD(product.getCARD());
		existingBilling.setPIN(product.getPIN());
		return productrepo.save(existingBilling);
	}
}
