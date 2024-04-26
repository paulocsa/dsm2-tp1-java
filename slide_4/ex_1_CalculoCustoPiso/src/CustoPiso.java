
import javax.swing.JOptionPane;


public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;

    public CustoPiso() {
        this(0.0,0.0,0.0,0.0);
         
        
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
    
    
    public void inserirValores(){
       double comprimentoComodo =  Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do comprimento"));
       setComprimentoComodo(comprimentoComodo);
       
       double larguraComodo =  Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da largura do comodo"));
       setLarguraComodo(larguraComodo);
       
       double precoPorArea = Double.parseDouble(JOptionPane.showInputDialog(null,"Preço por área(m2)"));
       setPrecoPorArea(precoPorArea);
    }
    
    public void calcularPrecoArea(){
        setCustoTotalComodo(getComprimentoComodo() * getLarguraComodo() * getPrecoPorArea());
    }
    
    public void mostrarValores(){
        
    }
    
    
    
}
