create database escola;

use escola;

drop table aluno;

create table aluno(
 Id INT not null primary key,
 Nome VARCHAR(40) not null,
 Cpf VARCHAR(14) not null unique
);

select * from aluno;