/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaempregadofaculdadept2;

/**
 *
 * @author Arthur Coutinho
 */
public class FuncionarioFaculdade extends EmpregadoFaculdade{
    protected String setor;

    public FuncionarioFaculdade(String setor, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.setor = setor;
    }
    
    @Override
    public double calculaSalario(){
        return this.salarioBase;
    }
}
