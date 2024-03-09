package ex_3_moveis_vendidos;
import java.util.Scanner;
public class Ex_3_moveis_vendidos {

    
    public static void main(String[] args) {
        double salario = 1000;
        double bonus = 50;

        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de moveis vendido pelo funcionario: ");
        double moveis_vendidos = leia.nextDouble();

        double salario_final = salario + (bonus * moveis_vendidos);

        System.out.println("O salario final do funcionario é: " + salario_final);
   
    }
    
}
