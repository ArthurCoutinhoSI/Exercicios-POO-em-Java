/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciolascouexception;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ExercicioLascouException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        
        try{
            pessoa3.setIdade(33);
            pessoa1.setIdade(0);
            pessoa2.setIdade(151);
        } catch (LascouException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
