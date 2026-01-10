/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programafaculdade;

/**
 *
 * @author Arthur Coutinho
 */
public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;

    public EmpregadoDaFaculdade(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGastos() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "EmpregadoDaFaculdade{" + "nome=" + nome + ", salario=" + salario + '}';
    }
    
}
