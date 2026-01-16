/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.bijouteria;

/**
 *
 * @author Arthur Coutinho
 */
public class Anel {
    private String tipoMaterial;
    private double largura;
    private double diametro;

    public Anel(String tipoMaterial, double largura, double diametro) {
        this.tipoMaterial = tipoMaterial;
        this.largura = largura;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Anel{" + "tipoMaterial=" + tipoMaterial + ", largura=" + largura + ", diametro=" + diametro + '}';
    }
    
}
