/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabuleirodexadrezdetamanhovariavel;

/**
 *
 * @author Andressa
 */
public class TabuleiroXadrez {
    private int tamanhoDoTabuleiro;

    public TabuleiroXadrez(int tamanhoDoTabuleiro) {
        if(tamanhoDoTabuleiro % 2 == 1){
            System.err.println("Tamanho do tabuleiro precisa ser par");
            return;
        }            
        this.tamanhoDoTabuleiro = tamanhoDoTabuleiro;
    }
    
    public String toStringLiteral(){
        String resp = "";
        for (int i = 0; i < this.tamanhoDoTabuleiro; i++) {
            for (int j = 0; j < this.tamanhoDoTabuleiro; j++) {
                if(j % 2 == i % 2)
                    resp += "X";
                else
                    resp += " ";
            }
            resp += "\n";
        }
        return resp;
    }
    
}
