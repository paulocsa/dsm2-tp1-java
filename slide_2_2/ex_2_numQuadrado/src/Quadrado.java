
import javax.swing.JOptionPane;


public class Quadrado {
    private double numero;
    private double resultado;

    public Quadrado() {
        this(0,0);
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularquadrado(){
        resultado = numero * numero;
    }
    
    public void processarquadrado(){
        setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para ver o quadrado de seu valor:")));
        calcularquadrado();
    }
    
    public void mostrarQuadrado(){
        JOptionPane.showMessageDialog(null, "O quadrado do número é:" + resultado);
    }
    
    
    
}


