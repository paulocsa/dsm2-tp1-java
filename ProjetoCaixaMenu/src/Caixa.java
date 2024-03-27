
import javax.swing.JOptionPane;

public class Caixa {

    private double valor;
    private double saldo;

    public Caixa() {
        this(0.0, 0.0);
    }

    public Caixa(double valor, double saldo) {
        this.valor = valor;
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
   
    //metodo sem parametro sem retorno
    public void depositar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:")));
        setSaldo( getValor() + getSaldo());
    }
    
    
     //metodo com parametro e com retorno   
    public double depositar( double v){
        setSaldo(v + getSaldo());
        return getSaldo();
    }
    
    //metodo sem parametro  e com retorno
    public double sacar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de saque ")));
        setSaldo( getSaldo() - getValor());
        return getSaldo();
    }
    
    public double consultaSaldo(){
        return getSaldo();
    }
    
}
