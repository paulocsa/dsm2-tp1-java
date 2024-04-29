package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Usuario {
    private int Codigo;
    private String nome;
    private String email;
    private String login;
    private String senha;

    private Conexao con = new Conexao();
    
    public Usuario() {
        this(0,"","","","");
    }

    public Usuario(int Codigo, String nome, String email, String login, String senha) {
        this.Codigo = Codigo;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     public void cadastrarUsuario(){
         String sql= "Insert into usuarios(nome,email,login,senha)values "+
                "('"+ this.getNome()+"','"+this.getEmail()+"','"+this.getLogin()+"','"+ this.getSenha()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet consultarUsuario(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from usuarios";
        tabela = con.RetornarResultset(sql);
     return tabela; 
    }

    public void excluirUsuario(){
        String sql;
        sql= "Delete from usuarios where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }  
    
    public void alterarUsuario(){
        String sql;
        sql="Update usuarios set nome='"+ getNome()+"',email='"+getEmail()+"',login='"+getLogin()+"',senha='"+getSenha()+"' where codigo="+ getCodigo();
        con.executeSQL(sql);
    }
}
