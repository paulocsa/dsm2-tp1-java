package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    
    private Conexao conCliente = new Conexao();
    
    public Cliente() {
        this(0, "", "", "");
    }

    public Cliente(int codigo, String nome, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void gravar() {
        String sql;
        sql = "Insert into Cliente(codigo,nome,telefone,email) values " +
                "(" + this.getCodigo() + ",'" + this.getNome() + "','" + this.getTelefone() + "','" + this.getEmail() + "')";
        conCliente.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro gravado com sucesso...");
    }
    
    public ResultSet consultar() {
        ResultSet tabela = null;
        String sql = "Select * from cliente";
        tabela = conCliente.RetornarResultset(sql);
        return tabela;
    }
}
