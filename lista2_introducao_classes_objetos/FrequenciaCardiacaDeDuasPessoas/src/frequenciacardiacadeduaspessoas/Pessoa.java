/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frequenciacardiacadeduaspessoas;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class Pessoa {
    private String nome;
    private int idade;
    private int frequenciaCardiaca;

    public Pessoa(String nome, int idade, int frequenciaCardiaca) {
        this.nome = nome;
        this.idade = idade;
        this.frequenciaCardiaca = frequenciaCardiaca;
    }
    
    public Pessoa() {
    }

    public void recebeInformacoesDaPessoa(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome da pessoa");
        setNome(scanner.next());
        System.out.println("Informe o idade da pessoa");
        setIdade(scanner.nextInt());
        System.out.println("Informe a frequencia cardiaca da pessoa");
        setFrequenciaCardiaca(scanner.nextInt());
    }
    
    public void veridicaSeFrequenciaEstaElevada(){
        if(getFrequenciaCardiaca() > 220 - getIdade()){
            System.out.println(""
                    + getNome()
                    + "está com frequencia cardiaca elevada");
        }
    }
    
    public static void mostraPessoaComMaiorFrequencia(Pessoa pessoa1, Pessoa pessoa2){
        if(pessoa1.getFrequenciaCardiaca() > pessoa2.getFrequenciaCardiaca()){
            System.out.println(pessoa1.getNome() + " tem frequencia cardiaca maior: "
                    + pessoa1.getFrequenciaCardiaca());
            return;
        }
        if(pessoa1.getFrequenciaCardiaca() > pessoa2.getFrequenciaCardiaca()){
            System.out.println(pessoa1.getNome() + " tem frequencia cardiaca maior: "
                    + pessoa1.getFrequenciaCardiaca());
            return;
        }
        System.out.println("Ambas as pessoas tem a mesma frequencia: "
                + pessoa1.getFrequenciaCardiaca());
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFrequenciaCardiaca(int frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", frequenciaCardiaca=" + frequenciaCardiaca + '}';
    }
}
