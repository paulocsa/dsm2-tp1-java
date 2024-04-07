
import javax.swing.JOptionPane;


public class Loja {
    
    private int ano;
    private int idade;
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;

    public Loja() {
        this(0, 0, "", "", 0.0, 0.0, 0.0);
    }

    public Loja(int ano, int idade, String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.ano = ano;
        this.idade = idade;
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    
    
    public void inserirDadosLoja() {
        razaoSocial = JOptionPane.showInputDialog("Digite a razão social da loja:");
        cpfCliente = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"));
        qtdItensComp = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de itens comprados:"));
    }

    public String mostrarDadosLoja() {
        return "Razão Social: " + razaoSocial +
               "\nCPF do Cliente: " + cpfCliente +
               "\nValor da Compra: " + valorCompra +
               "\nQuantidade de Itens Comprados: " + qtdItensComp +
               "\nValor Total da Compra: " + valorTotalCompra;
    }

    public double calcularCompraLoja() {
        valorTotalCompra = valorCompra * qtdItensComp;
        return valorTotalCompra;
    }
}
    
    
    
    

