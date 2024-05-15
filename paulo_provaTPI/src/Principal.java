
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Instanciando objeto da classe CustoPiso
        AreaTerreno areaterreno = new AreaTerreno();

        // Menu de opções
        int escolha;
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n" +
                    "1- Inserir os valores do terreno\n" +
                    "2- Mostrar os valores do terreno\n" +
                    "0- Sair\n" +
                    "Escolha uma opção:"
            ));

            switch (escolha) {
                case 1:
                    areaterreno.calcularArea();
                    break;
                case 2:
                    areaterreno.mostrarArea();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        } while (escolha != 0);
    }
}
