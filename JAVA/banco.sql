CREATE DATABASE Banco;
USE Banco;
CREATE TABLE FUNCIONARIO
(
EMP_NO SMALLINT NOT NULL,
FIRST_NAME VARCHAR(15) NOT NULL,
LAST_NAME VARCHAR(20) NOT NULL,
PHONE_EXT VARCHAR(4),
DEPT_NO CHAR(3) NOT NULL,
JOB_CODE VARCHAR(5) NOT NULL,
JOB_GRADE SMALLINT NOT NULL,
JOB_COUNTRY VARCHAR(15) NOT NULL,
SALARY NUMERIC(15,2) NOT NULL,
PRIMARY KEY (EMP_NO)
);
INSERT INTO Funcionario VALUES (2,'Paulo','Lannister','233','530', 'Eng','2','USA','15000.00');
INSERT INTO Funcionario VALUES (3,'Jhon','Mandes','240','160', 'Eng','2','USA','35000.00');
INSERT INTO Funcionario VALUES (4,'Alice','Kill','433','190', 'Eng','2','USA','55000.00');
INSERT INTO Funcionario VALUES (5,'Robert','Weston','253','230', 'Eng','2','USA','25000.00');