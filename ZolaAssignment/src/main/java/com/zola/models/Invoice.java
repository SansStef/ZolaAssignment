package com.zola.models;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "invoices")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private long id;
	@Column(name="invoice_number")
	@JsonProperty("invoice_number")
	private String invoiceNumber;
	@Column(name="po_number")
	@JsonProperty("po_number")
	private String poNumber;
	@Column(name="due_date")
	@JsonProperty("due_date")
	private LocalDate dueDate;
	@Column(name="amount_cents")
	@JsonProperty("amount_cents")
	private long amountCents;
	@CreationTimestamp
	@Column(name="created_at")
	@JsonProperty("created_at")
	@JsonFormat(pattern="yyyy-MM-dd'T'hh:mm:ssZ")
	private Date createdAt;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public long getAmountCents() {
		return amountCents;
	}
	public void setAmountCents(long amountCents) {
		this.amountCents = amountCents;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
