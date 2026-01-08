/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariodeempresa;

import java.time.LocalDate;

/**
 *
 * @author Arthur Coutinho
 */
public class Imovel extends BemMaterial{
    private double valorInicial;
    private LocalDate anoDeConstrucao;
    private double taxaDeDepreciacao;

    public Imovel(double valorInicial, LocalDate anoDeConstrucao, double taxaDeDepreciacao, String descricao) {
        super(descricao);
        this.valorInicial = valorInicial;
        this.anoDeConstrucao = anoDeConstrucao;
        this.taxaDeDepreciacao = taxaDeDepreciacao;
    }
    
    public double calculaValorDoBem(){
        return valorInicial - (valorInicial * (
                LocalDate.now().getYear() - anoDeConstrucao.getYear())
                * taxaDeDepreciacao);
    }
    
}
