
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
       Vendedor vendedor = new Vendedor();
        vendedor.solicitarDados(); // Solicita os dados do vendedor via JOptionPane
        
        while (true) {
            String opcaoStr = JOptionPane.showInputDialog(
                    "--- Menu ---\n" +
                    "1. Visualizar nome do vendedor\n" +
                    "2. Visualizar salário base do vendedor\n" +
                    "3. Visualizar valor vendido pelo vendedor\n" +
                    "4. Calcular comissão\n" +
                    "5. Sair\n" +
                    "Escolha uma opção:");

            int opcao = Integer.parseInt(opcaoStr);

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Nome do vendedor: " + vendedor.getNome());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Salário base do vendedor: " + vendedor.getSalarioBase());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Valor vendido pelo vendedor: " + vendedor.getValorVendido());
                    break;
                case 4:
                    double novoSalario = vendedor.calculoComissao();
                    vendedor.setNovoSalario(novoSalario);
                    JOptionPane.showMessageDialog(null, "Novo Salário do vendedor (com comissão): " + vendedor.getNovoSalario());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}