    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.automotivo;

/**
 *
 * @author Andressa
 */
public class Pneu {
    private String marca;
    private int tamanhoAro;

    public Pneu(String marca, int tamanhoAro) {
        this.marca = marca;
        this.tamanhoAro = tamanhoAro;
    }

    @Override
    public String toString() {
        return "Pneu{" + "marca=" + marca + ", tamanhoAro=" + tamanhoAro + '}';
    }
    
}
