import javax.swing.JOptionPane;

public class Vendedor {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public Vendedor() {
        this("", 0.0, 0.0, 0.0);
    }

    public Vendedor(String nome, double salarioBase, double valorVendido, double novoSalario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    // Método para solicitar os dados do vendedor usando JOptionPane
    public void solicitarDados() {
        String nome = JOptionPane.showInputDialog("Digite o nome do vendedor:");
        setNome(nome);

        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do vendedor:"));
        setSalarioBase(salarioBase);

        double valorVendido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido pelo vendedor:"));
        setValorVendido(valorVendido);
    }

    

    public double calculoComissao() {
        return ((getValorVendido() * 10) / 100) + getSalarioBase();
    }
}
