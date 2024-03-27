
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class MediaMatematica {
    
    private double n1;
    private double n2;
    private double media;
    private String nome;

    
    
    public MediaMatematica() {
        this(0.0,0.0,0.0,"");
    }
    public MediaMatematica(Double n1, Double n2, Double media, String nome) {
        this.n1 = n1;
        this.n2 = n2;
        this.media = media;
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void CalcularMedia() {
        media = (n1 + n2)/2;
    }
    
    public void processarNumero() {
    setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do numero 1:")));
    setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do numero 2:")));
    CalcularMedia();
}
    
    public void mostrarMedia(){
        JOptionPane.showMessageDialog(null, "Media entre o numero " + n1 + " e " + n2 +"\n" +
        "Média: "+ media);
    }

    
    

    

    
    
    
}
