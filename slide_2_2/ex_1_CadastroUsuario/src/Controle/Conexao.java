package Controle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;


public class Conexao {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url= "jdbc:mysql://127.0.0.1/bancousuario";
    
    final private String usuario="root";
    final private String senha="";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
        boolean result = true;
        
    
}
