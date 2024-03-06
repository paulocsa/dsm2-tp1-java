/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_4_retangulo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_4_retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double a,b,area,perimetro;
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Digite o valor de A(altura) do retangulo:");
        a = leia.nextDouble();
        
        
        System.out.print("Digite o valor de B(largura) do retangulo:");
        b = leia.nextDouble();
        
        
        area = a*b;
        
        perimetro = a*a + 2*b;
        
        System.out.printf("O valor do perimetro do retangulo é: %.2f cm \n" , perimetro );
       
        System.out.printf("O valor da area do retangulo é: %.2f cm \n" , area );

        
    }
    
}
