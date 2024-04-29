
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        CalculoQuadrado quad = new CalculoQuadrado();
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n" +
                    "1 - Calcular Área do Quadrado\n" +
                    "2 - Calcular Perímetro do Quadrado\n" +
                    "3 - Mostrar Valores\n" +
                    "0 - Sair\n\n" +
                    "Escolha uma opção:"));
            
            switch (opcao) {
                case 1:
                    double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A do quadrado:"));
                    double area = quad.calcularArea(ladoA);
                    JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
                    break;
                case 2:
                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A do quadrado:"));
                    double perimetro = quad.calcularPerimetro(ladoA);
                    JOptionPane.showMessageDialog(null, "O perímetro do quadrado é: " + perimetro);
                    break;
                case 3:
                    quad.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}
