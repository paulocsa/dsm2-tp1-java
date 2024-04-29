CREATE database crudUsuarios;
USE crudUsuarios;
CREATE TABLE usuarios (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    login VARCHAR(255),
    senha VARCHAR(255)
);