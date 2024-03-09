
package ex_2_elevado_quadrado;
import java.util.Scanner;
public class Ex_2_elevado_quadrado {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);      
        System.out.print("Digite um número inteiro: ");
        int numero = leia.nextInt();
        int quadrado = numero * numero;
        System.out.println("O quadrado do número " + numero + " é: " + quadrado);
    }
    
}
