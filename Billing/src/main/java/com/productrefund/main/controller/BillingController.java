package com.productrefund.main.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productrefund.main.entity.Billing;
import com.productrefund.main.service.BillingService;



@RestController
public class BillingController {

	@Autowired
	private BillingService service;

	@PostMapping("/addCREDIT_PAYBILL")
	public Billing addCreditPaybill(@RequestBody Billing product) {
		return service.saveBilling(product);
	}
	
	@GetMapping("/getAllCREDIT_PAYBILL")
	public List<Billing> getAllCREDIT_PAYBILL(){
		return BillingService.getAll();
	}

	@PostMapping("/addCREDIT_PAYBILLs")
	public List<Billing> addCreditPaybills(@RequestBody List<Billing> products) {
		return service.saveBillings(products);
	}

	@GetMapping("/CREDIT_PAYBILLs")
	public List<Billing> findAllCreditBills() {
		return service.getBillings();
	}

	@GetMapping("/CREDIT_PAYBILLs/{id}")
	public Billing findCreditPaybillById(@PathVariable int id) {
		return service.getBillingById(id);
	}

	@GetMapping("/CREDIT_PAYBILLs/{name}")
	public Billing findCreditPaybillname(@PathVariable String name) {
		return service.getBillingByName(name);
	}

	@PutMapping("/update/{id}")
	public Billing updateBilling(@RequestBody Billing product) {
		return service.updateBilling(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBilling(@PathVariable int id) {
		return service.deleteBilling(id);
	}

}