/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programafaculdade;

/**
 *
 * @author Arthur Coutinho
 */
public class ProfessorFaculdade extends EmpregadoDaFaculdade{
    private int qtdHorasTrabalhadas;
    private double adicionalHora  = 0.1;

    public ProfessorFaculdade(int qtdHorasTrabalhadas, String nome, double salario) {
        super(nome, salario);
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }    

    @Override
    public String toString() {
        return super.toString()
                + "ProfessorFaculdade{" + "qtdHorasTrabalhadas=" + qtdHorasTrabalhadas + ", adicionalHora=" + adicionalHora + '}';
    }
}
