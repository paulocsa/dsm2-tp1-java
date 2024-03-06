
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // INSTANCIAR OBJETO DA CLASSE PESSOA 
        
            Pessoa pes = new Pessoa();
            
            
            
            Scanner leia = new Scanner(System.in);
            
            System.out.println("Digite o seu nome:");
            pes.setNome(leia.nextLine());
            
            System.out.println("Digite a sua idade:");
            pes.setIdade(leia.nextInt());
            
            System.out.println("Digite o seu endereço:");
            pes.setEndereco(leia.nextLine());
            
            System.out.println("Digite o seu telefone:");
            pes.setTelefone(leia.nextLine());
            
            
            
            
//            pes.setNome("Paulo Cesar Pedro Candiani");
//            pes.setEndereco("Rua Lá em casa");
//            pes.setIdade(25);
//            pes.setTelefone("13-98110-96356");
            
            
            //Chamar o metodo que mostra o dado
            
            pes.MostraDados();
        
        
    }
    
}
