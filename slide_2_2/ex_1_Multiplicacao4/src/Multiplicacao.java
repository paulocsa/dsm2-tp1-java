
import javax.swing.JOptionPane;


public class Multiplicacao {
    private int valor;
    private int resultado;

    
    
    public Multiplicacao() {
        this(0, 0);
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    
    public void processarMultiplicacao() {
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do número que deseja multiplicar por 4:"));  
    }
   
    public void multiplicacao4() {
        resultado = valor * 4;
    }
   
    public void mostrarMultiplicacao() {
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação por 4 é: " + resultado);
    }
    
    
    
    
    
    
}
