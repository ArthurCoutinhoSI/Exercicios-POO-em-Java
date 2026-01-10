/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariodeempresa;

/**
 *
 * @author Arthur Coutinho
 */
public abstract class BemMaterial {
    protected String descricao;

    public BemMaterial(String descricao) {
        this.descricao = descricao;
    }
        
    public abstract double calculaValorDoBem();
}
