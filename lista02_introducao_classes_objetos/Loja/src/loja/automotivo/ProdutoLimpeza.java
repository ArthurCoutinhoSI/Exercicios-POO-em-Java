/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.automotivo;

/**
 *
 * @author Andressa
 */
public class ProdutoLimpeza {
    private String tipo;
    private String marca;
    private int qtdMl;

    public ProdutoLimpeza(String tipo, String marca, int qtdMl) {
        this.tipo = tipo;
        this.marca = marca;
        this.qtdMl = qtdMl;
    }

    @Override
    public String toString() {
        return "ProdutoLimpeza{" + "tipo=" + tipo + ", marca=" + marca + ", qtdMl=" + qtdMl + '}';
    }
}
