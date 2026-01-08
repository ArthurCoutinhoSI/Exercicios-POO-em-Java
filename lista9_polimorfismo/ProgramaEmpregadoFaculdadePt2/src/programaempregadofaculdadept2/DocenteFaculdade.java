/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaempregadofaculdadept2;

/**
 *
 * @author Arthur Coutinho
 */
public class DocenteFaculdade extends FuncionarioFaculdade{
    private int qtdHorasAula;
    private double valorHoraAula;

    public DocenteFaculdade(int qtdHorasAula, double valorHoraAula, String setor, String nome, double salarioBase) {
        super(setor, nome, salarioBase);
        this.qtdHorasAula = qtdHorasAula;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double calculaSalario() {
        return salarioBase + (qtdHorasAula * valorHoraAula);
    }
}
