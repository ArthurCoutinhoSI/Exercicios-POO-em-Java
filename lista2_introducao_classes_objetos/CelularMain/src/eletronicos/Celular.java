/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eletronicos;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class Celular {
    private String marca;
    private String modelo;
    private double qtdGbArmazenamento;
    private double qtdGbMemoria;
    private int numProcessadores;

    public Celular(String marca, String modelo, double qtdGbArmazenamento, double qtdGbMemoria, int numProcessadores) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdGbArmazenamento = qtdGbArmazenamento;
        this.qtdGbMemoria = qtdGbMemoria;
        this.numProcessadores = numProcessadores;
    }
    
    public double calculaPontuacao(){
        return this.qtdGbArmazenamento * this.qtdGbMemoria * this.numProcessadores;
    }
    
    public static Celular recebeInformacoesDeCelular(){
        String marca;
        String modelo;
        double qtdGbArmazenamento;
        double qtdGbMemoria;
        int numProcessadores;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a marca do celular");
        marca = scanner.next();
        System.out.println("Informe o modelo do celular");
        modelo = scanner.next();
        System.out.println("Informe a quantidade de Gb de armazenamento  do celular");
        qtdGbArmazenamento = scanner.nextDouble();
        System.out.println("Informe a quantidade de Gb de memoria do celular");
        qtdGbMemoria = scanner.nextDouble();
        System.out.println("Informe o numero de processadores do celular");
        numProcessadores = scanner.nextInt();
        
        return new Celular(marca, modelo, qtdGbArmazenamento, qtdGbMemoria, numProcessadores);
    }

    public int compareTo(Celular outroCelular) {
        if (this.calculaPontuacao() < outroCelular.calculaPontuacao()) {
            return -1;
        }
        if (this.calculaPontuacao() > outroCelular.calculaPontuacao()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + ", qtdGbArmazenamento=" + qtdGbArmazenamento + ", qtdGbMemoria=" + qtdGbMemoria + ", numProcessadores=" + numProcessadores + '}';
    }
    
}
