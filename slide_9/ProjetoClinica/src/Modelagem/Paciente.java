package Modelagem;

import Controle.conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Paciente {
    private int codpaciente;
    private String nome;
    private String endereco;
    private String complemento;
    private String RG;
    private String CPF;
    private String datanascimento;
    conexao con = new conexao();

    public Paciente() {
        this(0,"","","","","","");
    }

    public Paciente(int codpaciente, String nome, String endereco, String complemento, String RG, String CPF, String datanascimento) {
        this.codpaciente = codpaciente;
        this.nome = nome;
        this.endereco = endereco;
        this.complemento = complemento;
        this.RG = RG;
        this.CPF = CPF;
        this.datanascimento = datanascimento;
    }

    public int getCodpaciente() {
        return codpaciente;
    }

    public void setCodpaciente(int codpaciente) {
        this.codpaciente = codpaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }
 public void cadastrarPaciente(){
        String sql;
        sql = "insert into pacientes (codpaciente, nome, endereco, complemento, rg, cpf, datanascimento) VALUES "
                + "('"+getCodpaciente()+"', '"+getNome()+"', '"+getEndereco()+"', '"+getComplemento()+"', '"+getRG()+"', '"+getCPF()+"', '"+getDatanascimento()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
    }
    public void excluirPaciente(){
        String sql;
        sql= "Delete from pacientes where codpaciente=" +getCodpaciente();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso.");
        
    }
    public void alterarPaciente(){
    String sql;
    sql = "update pacientes set nome = '" + this.getNome() + "', endereco ='" + this.getEndereco() + "', complemento='"+this.getComplemento() + "',"
            + "rg='" + this.getRG() + "', cpf='" + this.getCPF() + "', datanascimento='" + this.getDatanascimento() + "' where codpaciente=" + this.getCodpaciente(); 
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso.");    
    }
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        String sql= "Select * from pacientes";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    } 
}  