package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Venda {
    private int codigo;
    private String nomeVendedor;
    private String produtoVendido;
    
    Conexao con = new Conexao();

    public Venda() {
        this(0,"","");
    }

    public Venda(int codigo, String nomeVendedor, String produtoVendido) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.produtoVendido = produtoVendido;
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

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    
    public void cadastrarVenda(){
       String sql= "Insert into vendas(codigo, vendedor , produto )values "+
                "('"+ this.getCodigo()+"','"+this.getNomeVendedor()+"','"+this.getProdutoVendido()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso"); 
    }
    
    public ResultSet listarVenda(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from vendas";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void excluirVenda(){
        String sql;
        sql= "Delete from vendas where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterarVenda(){
        String sql;
        sql="Update vendas set codigo='"+ getCodigo()+"',vendedor='"+getNomeVendedor()+"',produto='"+getProdutoVendido()+"' where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
}
