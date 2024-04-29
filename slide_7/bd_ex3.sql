CREATE database crudVenda;

USE crudVenda;

CREATE TABLE vendas (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    vendedor VARCHAR(255),
    produto VARCHAR(255)
);
