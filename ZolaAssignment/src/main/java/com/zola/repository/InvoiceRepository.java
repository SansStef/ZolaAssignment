package com.zola.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.zola.models.Invoice;

@RestResource(path = "invoices")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long>{

	@Query("select i from Invoice i where i.invoiceNumber = ?1 order by createdAt desc")
    public Page<Invoice> findByInvoiceNumber(@Param("invoiceNumber") String invoiceNumber, Pageable pageable);

	@Query("select i from Invoice i where i.poNumber = ?1 order by createdAt desc")
	public Page<Invoice> findByPoNumber(@Param("poNumber") String invoiceNumber, Pageable pageable);
	
	public Page<Invoice> findAllByOrderByCreatedAtDesc(Pageable pageable);
	
}
