
/* Drop Tables */

DROP TABLE Record CASCADE CONSTRAINTS;
DROP TABLE Student CASCADE CONSTRAINTS;
DROP TABLE Subject CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Record
(
	Record_No number(10,0) NOT NULL,
	StudentNo_Record number(10,0) NOT NULL UNIQUE,
	SubjectNo_Record varchar2(20) NOT NULL UNIQUE,
	Record_midterm number,
	Record_Final number,
	PRIMARY KEY (Record_No)
);


CREATE TABLE Student
(
	Student_NO number(10,0) NOT NULL UNIQUE,
	Student_Name varchar2(20) NOT NULL,
	Student_Day date NOT NULL,
	Student_Address varchar2(100) NOT NULL,
	PRIMARY KEY (Student_NO)
);


CREATE TABLE Subject
(
	Subject_No varchar2(20) NOT NULL UNIQUE,
	Subject_Name varchar2(20) NOT NULL,
	Subject_TeacherID varchar2(20) NOT NULL,
	Subject_Semester number(1) NOT NULL,
	PRIMARY KEY (Subject_No)
);



/* Create Foreign Keys */

ALTER TABLE Record
	ADD CONSTRAINT StudentNo_Record FOREIGN KEY (StudentNo_Record)
	REFERENCES Student (Student_NO)
;


ALTER TABLE Record
	ADD CONSTRAINT SubjectNo_Record FOREIGN KEY (SubjectNo_Record)
	REFERENCES Subject (Subject_No)
;



