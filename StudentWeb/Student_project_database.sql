CREATE TABLE STUDENT(
STUDENT_NO varchar(3) primary key,
STUDENT_NAME varchar(10),
STUDENT_DOB date,
STUDENT_DOJ date);

CREATE TABLE PROJECT(
PRJ_NO varchar(3) primary key,
PRJ_NAME varchar(15),
PRJ_DUR int(2),
PRJ_PLATFROM varchar(10));

create table STUDENT_PROJECT(
STUDENT_NO varchar(3),
PRJ_NO varchar(3),
DESIGNATION varchar(10)
primary key(STUDENT_NO,PRJ_NO,DESIGNATION),
foreign key(STUDENT_NO) references STUDENT(STUDENT_NO),
foreign key(PRJ_NO) references PROJECT(PRJ_NO));


Insert into STUDENT(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) values(S01,"Yogesh Mishra",DATE '1997-06-03',DATE '2021-02-17');
Insert into STUDENT(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) values(S02,"Shubham ",DATE '1995-10-27',DATE '2021-02-15');

Insert into PROJECT(PRJ_NO,PRJ_NAME,PRJ_DUR,PRJ_PLATFROM) values(P01,"Web Management",2,"HTML");
Insert into PROJECT(PRJ_NO,PRJ_NAME,PRJ_DUR,PRJ_PLATFROM) values(P02,"School Management",4,"Java");


Insert into STUDENT_PROJECT(STUDENT_NO,PRJ_NO,DESIGNATION) values(S01,P01,"MCA");
Insert into STUDENT_PROJECT(STUDENT_NO,PRJ_NO,DESIGNATION) values(S02,P02,"Developer");

select * from STUDENT;
select * from PROJECT;
select * from STUDENT_PROJECT;


select * from STUDENT s, PROJECT p, STUDENT_PROJECT sp where sp.STUDENT_NO = s.STUDENT_NO and sp.PRJ_NO = p.PRJ_NO;
