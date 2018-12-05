package com.zola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zola.models.Invoice;
import com.zola.repository.InvoiceRepository;


@RestController
public class InvoiceController {

	@Autowired
	private InvoiceRepository invoiceRepo;
	
	@GetMapping("/invoice/{id}")
	public ResponseEntity<Invoice> getGameBySportAndID(@PathVariable("id") String id) 
	{
		Invoice invoice = invoiceRepo.getInvoice(id);
		
		return new ResponseEntity<Invoice>(invoice, HttpStatus.OK);
	}
	
	@PostMapping("/invoice")
	public ResponseEntity<Invoice> createInvoice(){
		Invoice invoice = invoiceRepo.getInvoice("");
		
		return new ResponseEntity<Invoice>(invoice, HttpStatus.OK);
	}
}
