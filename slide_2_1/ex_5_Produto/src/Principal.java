import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Produto prod = new Produto();
        
        prod.solicitarInformacoes();
        
        prod.exibirInformacoes();
    }
}
