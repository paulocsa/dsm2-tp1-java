/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1_dobro_triplo_num;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_1_dobro_triplo_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int n1,n2;
        
        double dobro, triplo;
        
        
        
        Scanner leia = new Scanner(System.in);
        
        
        
        System.out.print("Digite o valor do numero 1:");
        n1 = leia.nextInt();
        
        System.out.print("Digite o valor do numero 2:");
        n2 = leia.nextInt();
        
        
        
        dobro = n1 * 2;
        triplo = n2 *3;
        
        
        System.out.printf("O dobro do número 1 é %.0f e o triplo do numero 2 é %.0f. \n", dobro, triplo);
    }
    
}
