/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Pessoa {
    
    
    //Declarar atributos
    
    
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    
    //Cria construtores dos atributos
    public Pessoa() {
        this("",0,"","");
    }

    public Pessoa(String nome, int idade, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    //Encapsulamento dos atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    //Metodo da classe pessoa
    
    public void MostraDados(){
       System.out.println("Dados Pessoa, Nome: " +getNome() + "\n"
               + "Idade: " + getIdade()+ "\n"
               + "Endereço: " + getEndereco() + "\n"
               + "Telefone: " + getTelefone());
       
      
                
    }
    
    
    
    
    
    
}
