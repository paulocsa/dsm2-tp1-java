/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1_operacoes_matematicas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_1_operacoes_matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //declaração de variaveis   

        double num1, num2, divisao, mult, soma, sub; 

   

        Scanner leia = new Scanner(System.in);        

        System.out.print("Digite o primeiro valor:"); 


        num1 = leia.nextDouble(); 

        System.out.print("Digite o segundo valor:"); 

        num2 = leia.nextDouble(); 

     
        //calculo soma 

        soma = num1 + num2; 

        System.out.print("O valor da soma é:"+soma); 

         

        System.out.println(""); 

         

        //calculo da subtração 

        sub = num1 - num2; 

        System.out.print("O valor da subtração é:"+sub); 

         

        System.out.println(""); 

        //calculo da multiplicação 

        mult = num1 * num2; 

        System.out.print("O valor da multiplicação é:"+mult); 


        System.out.println(""); 


        //calculo da divisao 

        divisao = num1 / num2; 

        System.out.print("O valor da divisão é:"+divisao); 

         

        //arredondar valores decimais 

         

        DecimalFormat deci = new DecimalFormat("0.00"); 

         

         System.out.println(""); 

          

         System.out.print("O valor da divisão arredondado é:" + deci.format(divisao)); 

  

         

         //outra forma de arrendondar 
   

         System.out.println(""); 

 
         //1System.out.printf("O valor da divisão arredondado é: %.2f" , divisao); 


        // real - double 

        // real - float  

        // int - inteiro  

        // string - palavra 
        
        
    }
    
}
