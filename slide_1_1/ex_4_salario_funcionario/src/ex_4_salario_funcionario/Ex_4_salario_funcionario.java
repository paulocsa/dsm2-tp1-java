/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_4_salario_funcionario;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_4_salario_funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double salMin, salFun,qtdSal; 

         

        Scanner leia = new Scanner(System.in); 

         

        System.out.print("Digite seu salário:"); 

        salFun = leia.nextDouble(); 

         

        System.out.print("Digite o salário mínimo:"); 

        salMin = leia.nextDouble(); 

         

         

         

        qtdSal = salFun/salMin; 

         

        //arredondar valores decimais         

        DecimalFormat deci = new DecimalFormat("0"); 

        System.out.print("O funcionário ganha é :" + deci.format(qtdSal) + " salários mínimos. \n"); 
        
    }
    
}
