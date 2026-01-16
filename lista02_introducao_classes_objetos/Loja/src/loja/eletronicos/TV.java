/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.eletronicos;

/**
 *
 * @author Arthur Coutinho
 */
public class TV {
    private String marca;
    private String modelo;
    private int numpoPolegadas;

    public TV(String marca, String modelo, int numpoPolegadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numpoPolegadas = numpoPolegadas;
    }

    @Override
    public String toString() {
        return "TV{" + "marca=" + marca + ", modelo=" + modelo + ", numpoPolegadas=" + numpoPolegadas + '}';
    }
    
}
