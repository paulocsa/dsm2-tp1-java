package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    Conexao user = new Conexao();

    public Usuario() {
        this("","","","");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
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
        String sql;
        sql= "insert into usuarios(nome,email, login , senha) values" + 
             "('" + getNome() + "','" + getEmail() + "' , '" + getLogin() + "', '" + getSenha()+ "')";
        user.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Cadastrado! ");
    }
    
    public ResultSet listarUsuario() {
        ResultSet  tabela;
        tabela = null;
        
        String sql= "Select * from usuarios";
        tabela = user.RetornarResultset(sql);
        return tabela;
    }
}
