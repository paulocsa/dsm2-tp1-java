package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;
    
     Conexao con = new Conexao();

    public Produto() {
        this(0,"","");
    }

    public Produto(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto(){
        String sql;
        sql = "insert into produtos(codigo, nome, descricao) values" + 
      "(" + getCodigo() + ",'" + getNomeProduto() + "' , '" + getDescricao() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso ! ");
    }
    
    public ResultSet listarProduto(){
        ResultSet  tabela;
        tabela = null;
        
        String sql= "Select * from produtos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
