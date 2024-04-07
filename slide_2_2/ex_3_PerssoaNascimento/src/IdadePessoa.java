
import javax.swing.JOptionPane;


public class IdadePessoa {
    private int ano;
    private int idade;

    public IdadePessoa() {
        this(0,0);
    }

    public IdadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public void calcularIdade(){
        int anoAtual = 2024; 
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"))); 
        idade = anoAtual - ano; 
        
    }
    
    public void mostrarIdade(){
        JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + idade);     
    }
    
}
