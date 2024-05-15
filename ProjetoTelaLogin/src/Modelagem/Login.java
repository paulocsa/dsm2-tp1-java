
package Modelagem;
import Controle.Conexao;
import java.sql.ResultSet;

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
        
        
        String sql = "select * from usulogin where login = '" 
                + getLoginusu() +"' and senha = '"+getSenha()+"'";
        
        tabela = con.RetornarResulset(sql);
        
        
        return tabela;
    }
}
