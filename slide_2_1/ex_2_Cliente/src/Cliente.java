
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Cliente {
    
    private String nomeCliente;
    private String endereco;
    private String RG;
    private Object JOption;

    public Cliente() {
        this("","","");
    }

    public Cliente(String nomeCliente, String endereco, String RG) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.RG = RG;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    
    public void cadastrarCliente(){
        setNomeCliente(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        setEndereco(JOptionPane.showInputDialog("Digite o endereço do cliente: "));
        setRG(JOptionPane.showInputDialog("Digite o RG do cliente: "));
    }
    
    public void listarCliente(){
        JOptionPane.showMessageDialog
                (null, "Dados cliente: \n"
                        + "Nome: " + getNomeCliente()
                        + "\n Endereço: " + getEndereco()
                        + "\n RG: " + getRG());
    }
    
    
    
}
