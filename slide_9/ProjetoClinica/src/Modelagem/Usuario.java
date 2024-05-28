package Modelagem;

import Controle.conexao;
import java.sql.ResultSet;

public class Usuario {
    private int codusuario;
    private String login;
    private String senha;
    conexao con = new conexao();
    
    public Usuario() {
        this(0,"","");
    }

    public Usuario(int codusuario, String login, String senha) {
        this.codusuario = codusuario;
        this.login = login;
        this.senha = senha;
    }

    public int getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(int codusuario) {
        this.codusuario = codusuario;
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
    
    public ResultSet logar(){
        ResultSet tabela;
        tabela = null;
        
        String sql = "select * from usuario where login='" + getLogin() + "' and senha= '" +getSenha()+ "'";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }

    
}