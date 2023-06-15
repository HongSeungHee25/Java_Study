
/* Drop Tables */

DROP TABLE contract CASCADE CONSTRAINTS;
DROP TABLE customer CASCADE CONSTRAINTS;
DROP TABLE office CASCADE CONSTRAINTS;
DROP TABLE vehicle CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE contract
(
	contract_No varchar2(20) NOT NULL,
	contract_Car_No varchar2(7) NOT NULL,
	contract_customer_No number(3,0) NOT NULL,
	contract_Start_Office_No number(3,0) NOT NULL,
	contract_Start_driven varchar2(20) NOT NULL,
	contract_End_Office_No number(3,0) NOT NULL,
	contract_End_driven varchar2(20) NOT NULL,
	PRIMARY KEY (contract_No)
);


CREATE TABLE customer
(
	customer_No number(3,0) NOT NULL,
	customer_ident varchar2(30) NOT NULL UNIQUE,
	customer_Type varchar2(10) NOT NULL,
	customer_PNumber varchar2(13) NOT NULL,
	customer_address varchar2(30),
	PRIMARY KEY (customer_No)
);


CREATE TABLE office
(
	office_No number(3,0) NOT NULL,
	office_address varchar2(30) NOT NULL,
	office_PNumber varchar2(13) NOT NULL,
	PRIMARY KEY (office_No)
);


CREATE TABLE vehicle
(
	Car_No varchar2(7) NOT NULL,
	Car_Type varchar2(3) NOT NULL,
	Car_Last_Check_Date date,
	Car_Expire_Date date,
	PRIMARY KEY (Car_No)
);



/* Create Foreign Keys */

ALTER TABLE contract
	ADD CONSTRAINT contract_customer_No FOREIGN KEY (contract_customer_No)
	REFERENCES customer (customer_No)
;


ALTER TABLE contract
	ADD CONSTRAINT contract_Start_Office_No FOREIGN KEY (contract_Start_Office_No)
	REFERENCES office (office_No)
;


ALTER TABLE contract
	ADD CONSTRAINT contract_End_Office_No FOREIGN KEY (contract_End_Office_No)
	REFERENCES office (office_No)
;


ALTER TABLE contract
	ADD CONSTRAINT contract_Car_No FOREIGN KEY (contract_Car_No)
	REFERENCES vehicle (Car_No)
;



