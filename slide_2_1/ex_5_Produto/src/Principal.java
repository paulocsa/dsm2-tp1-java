import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome(JOptionPane.showInputDialog("Digite o nome do produto:"));
        produto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:")));
        produto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário:")));

        produto.calcularTotal();

        JOptionPane.showMessageDialog(null, "Nome: " + produto.getNome() + "\nQuantidade: " + produto.getQtde() +
                "\nValor Unitário: R$" + produto.getValor() + "\nTotal: R$" + produto.getTotal());
    }
}
