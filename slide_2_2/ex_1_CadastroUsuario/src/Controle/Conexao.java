package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1/bancousuario";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    private Statement statement;
    private ResultSet resultSet;

    public boolean conecta() {
        boolean result = true;

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage());
            result = false;
        }
        return result;
    }

    public void desconecta() {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar o banco de dados: " + e.getMessage());
        }
    }

    public void executeSQL(String sql) {
        conecta();

        try {
            statement = conexao.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar SQL: " + e.getMessage());
        } finally {
            desconecta();
        }
    }

    public ResultSet RetornarResultset(String sql) {
        ResultSet resultSet = null;

        conecta();

        try {
            statement = conexao.createStatement();
            resultSet = statement.executeQuery(sql);
            resultSet.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar resultset: " + e.getMessage());
        }
        return resultSet;
    }
}
