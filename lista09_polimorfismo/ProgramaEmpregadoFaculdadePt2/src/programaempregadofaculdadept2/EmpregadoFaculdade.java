/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaempregadofaculdadept2;

/**
 *
 * @author Arthur Coutinho
 */
public abstract class EmpregadoFaculdade {
    protected String nome;
    protected double salarioBase;

    public EmpregadoFaculdade(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
        
    public abstract double calculaSalario();
}
