package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Filme {

    private Conexao con = new Conexao();
    private int codigo;
    private String titulo;
    private String genero;
    private String produtora;
    private String dataCompra;

    public Filme() {
        this(0, "", "", "", "");
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

    public void cadastrarFilme() {
        String sql = "INSERT INTO filmes (Codigo, Titulo, Genero, Produtora, DataCompra) VALUES " +
                     "('" + getCodigo() + "','" + getTitulo() + "','" + getGenero() + "','" + getProdutora() + "','" + getDataCompra() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }

    public ResultSet consultarFilmes() {
        ResultSet tabela = null;
        String sql = "SELECT * FROM filmes";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }

    public ResultSet consultarCampoEspecifico(String campo) {
        ResultSet tabela = null;
        try {
            String sql = "SELECT * FROM filmes WHERE titulo LIKE '" + campo + "%'";
            tabela = con.RetornarResultset(sql);
        } catch (Exception sqle) {
            JOptionPane.showMessageDialog(null, "Atenção... " + sqle.getMessage());
        }
        return tabela;
    }

    public void excluirFilme() {
        String sql = "DELETE FROM filmes WHERE codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído.");
    }

    public void alterarFilme() {
        String sql = "UPDATE filmes SET titulo = '" + getTitulo() + "', genero = '" + getGenero() + "', produtora = '" + getProdutora() + "', dataCompra = '" + getDataCompra() + "' WHERE codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado.");
    }
}
