create database CrudUsuario;
use CrudUsuario;

create table usuarios(
	codigo int auto_increment primary key,
	nome varchar(50),
    email varchar(100),
	login varchar(50),
    senha varchar(30)
);


