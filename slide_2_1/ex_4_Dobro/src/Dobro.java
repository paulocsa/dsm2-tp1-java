
import javax.swing.JOptionPane;

public class Dobro {
    
    private double numero;
    private double calculo;
    

    public Dobro() {
        this.numero = numero;
        this.calculo = calculo;
        
    }

    

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro() {
        calculo = numero * 2;
    }
    
    public void processarNumero(){
        String inputNumero = JOptionPane.showInputDialog("Digite o numero que deseja calcular o dobro:");
        setNumero(Double.parseDouble(inputNumero));
    }
    
    public void mostrarCalculo(){
        calcularDobro();
        JOptionPane.showMessageDialog(null, "Dobro do valor:\nNúmero: " + numero +
                "\nDobro: " + getCalculo());
    }
    
    
}
