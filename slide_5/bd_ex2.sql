create database bancoProduto;
use bancoProduto;

create table produtos(
codigo int auto_increment primary key,
nome varchar(50),
descricao varchar(50)
);

select * from produtos;