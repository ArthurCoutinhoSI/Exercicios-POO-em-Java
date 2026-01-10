/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaemissaocarbono;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Gado implements EmissaoCarbono{
    private double peso;

    public Gado() {
        this.solicitaEAtualizaDados();
    }
    
    private void solicitaEAtualizaDados(){
       String pesoString = JOptionPane.showInputDialog("informe o peso do gado", "550kg");
       pesoString = pesoString.replaceAll("\\D+", "");
       
       peso = Integer.parseInt(pesoString);
    }
    
    public double calculaEmissao(){
        return peso * 07;
    }
}
