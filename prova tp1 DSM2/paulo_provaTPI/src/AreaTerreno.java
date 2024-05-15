
import javax.swing.JOptionPane;


public class AreaTerreno {
    private double altgura;
    private double largura;
    private double area;

    public AreaTerreno() {
        this(0.0,0.0,0.0);
    }

    public AreaTerreno(double altgura, double largura, double area) {
        this.altgura = altgura;
        this.largura = largura;
        this.area = area;
    }

    public double getAltgura() {
        return altgura;
    }

    public void setAltgura(double altgura) {
        this.altgura = altgura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void calcularArea(){
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do terreno:"));
        setAltgura(altura);
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno:"));
        setLargura(largura);
        
        setArea(getLargura() * getAltgura());
    }
    
    
    public double mostrarArea(){
        
         JOptionPane.showMessageDialog(null,"O valor da área é:"+getArea());
        return 0;
    }
    
    
    
    
    
    
}
