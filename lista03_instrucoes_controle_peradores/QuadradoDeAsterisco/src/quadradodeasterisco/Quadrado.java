/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadradodeasterisco;

/**
 *
 * @author Arthur Coutinho
 */
public class Quadrado {
    private int tamanhoDoLado;

    public Quadrado(int tamanhoDoLado) {
        if (tamanhoDoLado > 20 || tamanhoDoLado < 1) {
            System.err.println("não é aceito quadrado de lado menor que 1 ou maior que 20");
            return;
        }
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public String toStringQuadradoFeito() {
        String resp = "";
        for (int i = 0; i < this.tamanhoDoLado; i++) {
            for (int j = 0; j < this.tamanhoDoLado; j++) {
                if (i == this.tamanhoDoLado - 1  || i == 0 || j == this.tamanhoDoLado - 1 || j == 0) {
                    resp += "*";
                }else{
                    resp += " ";
                }
            }
            resp += "\n";
        }
        return resp;
    }
    
    
}
