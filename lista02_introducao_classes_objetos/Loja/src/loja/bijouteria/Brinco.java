/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.bijouteria;

/**
 *
 * @author Arthur Coutinho
 */
public class Brinco {
    private String Descricao;
    private String marca;
    private int qtdMl;

    public Brinco(String Descricao, String marca, int qtdMl) {
        this.Descricao = Descricao;
        this.marca = marca;
        this.qtdMl = qtdMl;
    }

    @Override
    public String toString() {
        return "Brinco{" + "Descricao=" + Descricao + ", marca=" + marca + ", qtdMl=" + qtdMl + '}';
    }
    
}
