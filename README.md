#Zola Coding Assessment
#
#Stefano Sansone

To build/run

Use gradle to build and download dependencies.
Run as Spring app from main ZolaAssignmentApplication.java
Access at localhost:8080

Database:

The src/main/resources/application.properties file assumes mysql running on localhost:3306 with user: zola and no password and schema: invoices
The src/main/resources/schema.sql file details the create table statement for the invoices table in mysql.

Notes:

The backend api layer is accessed through localhost:8080/v1/invoices
The client code is accessed at localhost:8080 and makes ajax calls to the api layer.


The client code was written with javascript/jquery. While the html/css was based on a thymeleaf sample code which can be accessed 
at localhost:8080/invoices if interested. (It was used to check if pagination on backend was correct before client code was written.)