/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_3_total_a_pagar_produtos;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_3_total_a_pagar_produtos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nome; 

        Double total,quantidade_comprada,preco_unitario; 

    
        Scanner leia = new Scanner(System.in); 

        System.out.print("Digite o nome do produto:"); 

    
        nome = leia.nextLine(); 

        System.out.print("Digite a quantidade comprada do produto:"); 

        quantidade_comprada = leia.nextDouble(); 

        System.out.print("Digite o preço unitario do produto:"); 

        preco_unitario = leia.nextDouble(); 

        total = quantidade_comprada * preco_unitario; 

        System.out.printf("O valor de da compra de %.0f %s é: %.2f \n",quantidade_comprada,nome,total); 
    }
    
}
