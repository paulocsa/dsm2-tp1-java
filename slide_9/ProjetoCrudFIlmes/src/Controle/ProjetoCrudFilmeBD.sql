CREATE DATABASE ProjetoCrudFilme;

USE ProjetoCrudFilme;

CREATE TABLE filmes (
    codigo INTEGER PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    genero VARCHAR(20),
    produtora VARCHAR(100),
    datacompra DATE
);

