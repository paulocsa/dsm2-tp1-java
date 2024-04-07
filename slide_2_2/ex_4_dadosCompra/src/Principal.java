
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Loja loja = new Loja();
        
        loja.inserirDadosLoja();
        double totalCompra = loja.calcularCompraLoja();
        
        JOptionPane.showMessageDialog(null, loja.mostrarDadosLoja() + "\nValor Total da Compra: " + totalCompra);
    }
}