
/* Drop Tables */

DROP TABLE record CASCADE CONSTRAINTS;
DROP TABLE Student CASCADE CONSTRAINTS;
DROP TABLE Subject CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE record
(
	record_No number(10,0) NOT NULL UNIQUE,
	StudentNo_record number(10,0) NOT NULL UNIQUE,
	SubjectNo_record varchar2(20) NOT NULL UNIQUE,
	record_Midterm number NOT NULL,
	record_Final number NOT NULL,
	PRIMARY KEY (record_No)
);


CREATE TABLE Student
(
	Student_No number(10,0) NOT NULL UNIQUE,
	Student_Name varchar2(20) NOT NULL,
	Student_Day date NOT NULL,
	Student_Address varchar2(100) NOT NULL,
	PRIMARY KEY (Student_No)
);


CREATE TABLE Subject
(
	Subject_No varchar2(20) NOT NULL UNIQUE,
	Subject_Name varchar2(30) NOT NULL,
	Subject_TeacherID varchar2(20) NOT NULL,
	Subject_semester number(1) NOT NULL,
	PRIMARY KEY (Subject_No)
);



/* Create Foreign Keys */

ALTER TABLE record
	ADD FOREIGN KEY (StudentNo_record)
	REFERENCES Student (Student_No)
;


ALTER TABLE record
	ADD FOREIGN KEY (SubjectNo_record)
	REFERENCES Subject (Subject_No)
;



