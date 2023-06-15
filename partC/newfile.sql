
/* Drop Tables */

DROP TABLE students CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE students
(
	stuno char(6 char) NOT NULL,
	name varchar2(40 char) NOT NULL,
	PRIMARY KEY (stuno, name)
);



