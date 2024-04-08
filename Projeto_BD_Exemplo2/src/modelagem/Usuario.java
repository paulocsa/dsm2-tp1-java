
package modelagem;

import controle.conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class Usuario {
    
    private String nome;
    private String email;
    conexao con = new conexao();

    public Usuario() {
        this("","");
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
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
    
    
        public void cadastrar(){
        String sql;
        sql= "insert into Usuario(nome,email) values"+
                "(" + getNome() + " , '" + getEmail();
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado c sucesso");
    }
    
       public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from ___________";
        tabela = concliente.RetornarResultset(sql);
     return tabela;   
    }
}
