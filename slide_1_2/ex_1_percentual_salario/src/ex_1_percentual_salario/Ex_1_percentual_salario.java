/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1_percentual_salario;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_1_percentual_salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         double salario,reajuste,novo; 

         

        Scanner leia = new Scanner(System.in); 

         

        System.out.print("Digite o salário do funcionario: "); 

        salario = leia.nextDouble(); 

         

        System.out.print("Digite o percentual de reajuste em porcentagem: "); 

        reajuste = leia.nextDouble(); 

         

        novo = salario+(salario*reajuste)/100; 

         

         

        System.out.printf("O valor do percentual de reajuste é de:%.2f",novo); 
        
    }
    
}
