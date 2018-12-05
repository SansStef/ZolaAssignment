#For MySql db
create schema invoices;

CREATE TABLE invoices (
id SERIAL,
invoice_number VARCHAR(64) NOT NULL,
po_number VARCHAR(64) NOT NULL,
due_date DATE NOT NULL,
amount_cents BIGINT NOT NULL,
created_at datetime DEFAULT now()
);

#select * from invoices;
#desc invoices;