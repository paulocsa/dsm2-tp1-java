
import javax.swing.JOptionPane;

public class Calculadora {
    private double n1;
    private double n2;
    private double r;
    private String operador;

    public Calculadora() {
        this(0.0,0.0,0.0,"");
    }

    public Calculadora(double n1, double n2, double r, String operador) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
        this.operador = operador;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    public void Somar(){
        r = n1 + n2;
    }
    
    public void Subtrair(double a,double b){
        r = a - b;
    }
    
    public double Divisao(double a,double b){
        if(b != 0){
            return a / b;
        }else{
            System.out.println("Erro de divisão por zero");
            return 0;
        }
    }
    
    public void Multiplicacao(){
        r = n1 * n2;
    }
    
    
    public void MostrarResultado(){
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número:"));
        operador = JOptionPane.showInputDialog(null, "Digite o operador (+, -, *, /):");

        
        switch (operador) {
            case "+":
                Somar();
                break;
            case "-":
                Subtrair(n1, n2);
                break;
            case "*":
                Multiplicacao();
                break;
            case "/":
                r = Divisao(n1, n2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador inválido.");
                return; 
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + r);

    }

    
    
    
    
}
