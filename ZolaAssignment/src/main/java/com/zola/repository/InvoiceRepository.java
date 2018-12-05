package com.zola.repository;

import org.springframework.stereotype.Repository;

import com.zola.models.Invoice;

@Repository
public class InvoiceRepository {

	public Invoice getInvoice(final String invoiceNumber) {
		Invoice i = new Invoice();
		i.setInvoiceNumber(invoiceNumber);
		
		return i;
	}
}
