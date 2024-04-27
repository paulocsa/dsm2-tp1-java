import javax.swing.JOptionPane;

public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;

    public CustoPiso() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores() {
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento do cômodo:"));
        setComprimentoComodo(comprimento);

        double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a largura do cômodo:"));
        setLarguraComodo(largura);

        double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço por área do piso:"));
        setPrecoPorArea(preco);
    }

    public void calcularPrecoArea() {
        setCustoTotalComodo(getComprimentoComodo() * getLarguraComodo() * getPrecoPorArea());
    }

    public void mostrarValores() {
        JOptionPane.showMessageDialog(null, "Comprimento do cômodo: " + getComprimentoComodo() +
                "\nLargura do cômodo: " + getLarguraComodo() +
                "\nPreço por área do piso: " + getPrecoPorArea() +
                "\nCusto total do cômodo: " + getCustoTotalComodo());
    }
}
