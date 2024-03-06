/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_3_dias_vivido;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_3_dias_vivido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade, dias; 

         

         

         

    Scanner leia = new Scanner(System.in); 

     

    System.out.print("Digite sua idade:"); 

    idade = leia.nextInt(); 

     

    dias = idade * 365; 

     

    System.out.print("A quantidade de dias vividos por voce é de: " + dias + "\n"); 
    }
    
}
