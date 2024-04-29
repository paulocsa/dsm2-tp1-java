package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Venda {
    private int codigo;
    private String nomeVendedor;
    private String nomeProduto;

    Conexao venda = new Conexao();
   
    public Venda() {
        this(0,"","");
    }

    public Venda(int codigo, String nomeVendedor, String nomeProduto) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.nomeProduto = nomeProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public void cadastrarVenda(){
        String sql;
        sql = "insert into vendas(codigo, nomeVendedor, nomeProduto) values" + 
      "(" + getCodigo() + ",'" + getNomeVendedor() + "' , '" + getNomeProduto() + "')";
        venda.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso ! ");
    }
     
    public ResultSet listarVenda(){
        ResultSet  tabela;
        tabela = null;
        
        String sql= "Select * from vendas";
        tabela = venda.RetornarResultset(sql);
        return tabela; 
    }
}
