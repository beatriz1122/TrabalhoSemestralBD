create database Biblioteca

go

create table funcionario (
nome varchar (70) not null,
cpf char (11) not null,
telefone char (11) not null,
cep char (8) not null,
dat_nasc date not null,
id int not null primary key identity,
cargos_idCargo integer REFERENCES cargos (idCargo),
senha varchar (15) not null,
);

go

create table cargos (
idCargo int not null primary key identity,
nome varchar (20) not null
);

go

create table cliente(
nome varchar (70) not null,
cpf char (11) not null,
email varchar (150) not null,
telefone char (11) not null,
cep char (8) not null,
dat_nasc date not null,
);

go

create table livro(
titulo varchar (150) not null,
isbn integer not null primary key,
n_p char (5) not null,
ano_publ date not null,
generos_idGenero integer REFERENCES generos (idGenero),
autor varchar (150) not null,
editora varchar (50) not null
);

go

create table generos (
idGenero int not null primary key identity,
genero varchar (20) not null
);
 