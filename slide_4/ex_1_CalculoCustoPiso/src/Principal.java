
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Instanciando objeto da classe CustoPiso
        CustoPiso piso = new CustoPiso();

        // Menu de opções
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n" +
                    "1- Inserir valores do cômodo\n" +
                    "2- Calcular preço por área\n" +
                    "3- Mostrar valores\n" +
                    "0- Sair\n" +
                    "Escolha uma opção:"
            ));

            switch (opcao) {
                case 1:
                    piso.inserirValores();
                    break;
                case 2:
                    piso.calcularPrecoArea();
                    JOptionPane.showMessageDialog(null, "Cálculo realizado com sucesso!");
                    break;
                case 3:
                    piso.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
