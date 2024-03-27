
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        Caixa cx = new Caixa();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite a opção: "
                    + "\n1-Depositar"
                    + "\n2-Depositar(parametro)"
                    + "\n3-Sacar"
                    + "\n4-Consultar saldo"
                    + "\n0-Sair"));
            
            switch(op){
                case 1:
                    cx.depositar();
                    break;
                    
                case 2:
                    double val;
                    val = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:"));
                    cx.depositar(val);
                    break;
                case 3:
                    JOptionPane.showInputDialog(null, "Valor Saldo:" + cx.sacar());
                    break;
                case 4:
                    JOptionPane.showInputDialog(null, "Saldo atual:" + cx.consultaSaldo());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opçãop invalida");
            }
            
        }while( op != 0);
        
    }
    
}
