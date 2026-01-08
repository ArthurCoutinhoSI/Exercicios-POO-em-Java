/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.eletronicos;

/**
 *
 * @author Andressa
 */
public class Celular {
    private String marca;
    private String modelo;
    private int qtdMemiria;
    private int qtdArmazenamento;

    public Celular(String marca, String modelo, int qtdMemiria, int qtdArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdMemiria = qtdMemiria;
        this.qtdArmazenamento = qtdArmazenamento;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + ", qtdMemiria=" + qtdMemiria + ", qtdArmazenamento=" + qtdArmazenamento + '}';
    }
    
}
