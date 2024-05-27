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
public class Login {
    private int id;
    private String loginusu;
    private String senha;

    Conexao con = new Conexao();
    
    public Login() {
        this(0,"","");
    }

    public Login(int id, String loginusu, String senha) {
        this.id = id;
        this.loginusu = loginusu;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginusu() {
        return loginusu;
    }

    public void setLoginusu(String loginusu) {
        this.loginusu = loginusu;
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
        
        String sql = "select * from usuario where login= '" + getLoginusu() + "' and senha= '" + getSenha() + "'";
        
        tabela= con.RetornarResultset(sql);
        return tabela;
                
    }
    
}
