/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadradodeasterisco;

/**
 *
 * @author Arthur Coutinho
 */
public class Piramide {
    private int baseDaPiramide;

    public Piramide(int baseDaPiramide) {
        if (baseDaPiramide % 2 == 0) {
            System.err.println("não é aceito base de numero par");
            return;
        }
        this.baseDaPiramide = baseDaPiramide;
    }

    public String toStringPiramideFeita() {
        String resp = "";
        for (int i = 0; i < this.baseDaPiramide/2 + 1; i++) {
            for (int j = 0; j < this.baseDaPiramide/2 - i; j++) {
                resp += " ";
            }
            for (int j = 0; j < i; j++) {
                resp += "*";
            }
            resp += "*";
            for (int j = 0; j < i; j++) {
                resp += "*";
            }
            for (int j = 0; j < this.baseDaPiramide/2 - i; j++) {
                resp += " ";
            }
            resp += "\n";
        }
        return resp;
    }
    
        
}
