package programaarmazenaconsultas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthur Coutinho
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String email; 

    private Pessoa(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    //Factory Method estatico
    public static Pessoa criarPessoa(){
        String nome = 
                JOptionPane.showInputDialog( "Informe o nome do paciente",
                "Arthur");
        String telefone =
                JOptionPane.showInputDialog( "Informe o telefone do paciente",
                "6711112222");
        String email =
                JOptionPane.showInputDialog( "Informe o email do paciente",
                "arthur@gmail.com");
        
        return new Pessoa(nome, telefone, email);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
}
