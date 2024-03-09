
package ex_4_prestacao_atraso;

import java.util.Scanner;


public class Ex_4_prestacao_atraso {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o valor da prestação: ");
        double valor = leia.nextDouble();
        
        System.out.print("Digite a taxa de juros (em %): ");
        double taxa = leia.nextDouble();
        
         System.out.print("Digite a quantidade de meses em atraso: ");
        int tempo = leia.nextInt();
        
        double valorAtraso = valor + (valor * (taxa / 100) * tempo);
        
        System.out.println("O valor da prestação em atraso é: " + valorAtraso);
        
        
    }
    
}
