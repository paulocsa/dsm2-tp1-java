CREATE DATABASE crudProduto;


USE crudProduto;

CREATE TABLE produtos (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    descricao TEXT
);