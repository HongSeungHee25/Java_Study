
/* Drop Tables */

DROP TABLE rental CASCADE CONSTRAINTS;
DROP TABLE Customer CASCADE CONSTRAINTS;
DROP TABLE library CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Customer
(
	Customer_ID varchar2(20) NOT NULL UNIQUE,
	Customer_Name varchar2(20) NOT NULL,
	Customer_Number varchar2(20) NOT NULL,
	PRIMARY KEY (Customer_ID)
);


CREATE TABLE library
(
	library_ID varchar2(20) NOT NULL UNIQUE,
	library_tltle varchar2(30) NOT NULL,
	library_author varchar2(20) NOT NULL,
	library_publisher varchar2(30) NOT NULL,
	PRIMARY KEY (library_ID)
);


CREATE TABLE rental
(
	rental_ID varchar2(20) NOT NULL UNIQUE,
	libraryID_rental varchar2(20) NOT NULL UNIQUE,
	CustomerID_rental varchar2(20) NOT NULL UNIQUE,
	rental_date date,
	rental_return_date date,
	PRIMARY KEY (rental_ID)
);



/* Create Foreign Keys */

ALTER TABLE rental
	ADD FOREIGN KEY (CustomerID_rental)
	REFERENCES Customer (Customer_ID)
;


ALTER TABLE rental
	ADD FOREIGN KEY (libraryID_rental)
	REFERENCES library (library_ID)
;



