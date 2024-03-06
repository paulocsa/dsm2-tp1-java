/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2_valorpago_gasolina;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_2_valorpago_gasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           double litros, valorpago; 

   
        Scanner leia = new Scanner(System.in); 


        System.out.print("Digite a quantidade de litros abastecido:"); 

        litros = leia.nextDouble(); 


        valorpago = litros * 4.39; 

      

        System.out.printf("O valor pago por %.0f litros é de: %.2f \n", litros, valorpago); 
    }
    
}
