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

    
    public void entrarNome(String nome) {
        setNome(nome);
    }

    public void entrarSalarioBase(double salarioBase) {
        setSalarioBase(salarioBase);
    }
    
    public double calculoComissao() {
        return ((getValorVendido() * 10) / 100) + getSalarioBase(); // Calcula e retorna o novo salário
    }
}
