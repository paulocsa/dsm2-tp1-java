/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2_media_aritmetica;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_2_media_aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double n1,n2,n3,n4,n5,n6, media1,media2,soma; 

         

         

         

        Scanner leia = new Scanner(System.in); 

         

        System.out.print("Digite o valor do primeiro número:"); 

        n1 = leia.nextDouble(); 

         

        System.out.print("Digite o valor do segundo número:"); 

        n2 = leia.nextDouble(); 

         

        System.out.print("Digite o valor da terceiro número:"); 

        n3 = leia.nextDouble(); 

         

        System.out.print("Digite o valor do quarto número:"); 

        n4 = leia.nextDouble(); 

         

        System.out.print("Digite o valor do quinto número:"); 

        n5 = leia.nextDouble(); 

         

        System.out.print("Digite o valor do sexto número:"); 

        n6 = leia.nextDouble(); 

         

       
        media1 = (n1+n2+n3)/3; 

        media2 = (n4+n5+n6)/3; 

        soma = media1 + media2; 

                 

        System.out.printf("O valor da média 1 é: %.2f \n ", media1); 

        System.out.printf("O valor da média 2 é: %.2f \n " , media2); 

        System.out.printf("E a soma da média 1 e a média 2 é: %.2f \n" , soma); 
        
    }
    
}
