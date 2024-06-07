/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;

/**
 *
 * @author fatec-dsm2
 */
public class Filme {
    
     private Conexao con = new Conexao();
     private int codigo;
    private String titulo;
    private String genero;
    private String produtora;
    private String dataCompra;

    public Filme() {
        this(0,"","","","");
    }

    public Filme(int codigo, String titulo, String genero, String produtora, String dataCompra) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.produtora = produtora;
        this.dataCompra = dataCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public ResultSet consultarFilmes() {
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from filmes";
        tabela = con.RetornarResultset(sql);
     return tabela; 
    }
    
    
    
    
    
}
