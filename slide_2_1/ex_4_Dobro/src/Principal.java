import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número para calcular o dobro:");
        double numero = Double.parseDouble(input);
        
        Dobro d = new Dobro();
        d.setNumero(numero);
        d.calcularDobro();
        
        JOptionPane.showMessageDialog(null, "O dobro de " + d.getNumero() + " é: " + d.getCalculo());
    }
}
