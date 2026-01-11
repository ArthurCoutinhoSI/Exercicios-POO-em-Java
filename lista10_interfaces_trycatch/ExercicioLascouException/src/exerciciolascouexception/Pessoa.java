/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciolascouexception;

/**
 *
 * @author Arthur Coutinho
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws LascouException{
        if (idade > 150 || idade < 1) {
            throw new LascouException("a idade ata errada ó");
        }
        this.idade = idade;
    }
    
}
