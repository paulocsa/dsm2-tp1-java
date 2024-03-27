
import javax.swing.JOptionPane;

public class Produto {
    private String nome;
    private int qtde;
    private double valor;
    private double total;

    public Produto() {
        this("", 0, 0, 0);
    }
     

    public Produto(String nome, int qtde, double valor, double total) {
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
        this.total = total;
    }

    

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
   
    
    
    public void solicitarInformacoes() {
        
        setNome(JOptionPane.showInputDialog("Digite o nome do produto:"));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário:")));
        setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:")));
        calcularTotal();
        
    }
    public void calcularTotal() {
        total = qtde * valor;
    }

    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + "\nQuantidade: " + qtde +
                "\nValor Unitário: R$" + valor + "\nTotal: R$" + total);
    }
}
