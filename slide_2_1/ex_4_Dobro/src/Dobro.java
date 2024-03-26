public class Dobro {
    
    private double numero;
    private double calculo;

    public Dobro() {
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro() {
        calculo = numero * 2;
    }
}
