/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programafaculdade;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaFaculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("nome", 3000);
        ProfessorFaculdade professor = new ProfessorFaculdade(160, "Arthur", 10000);
        
        JOptionPane.showMessageDialog(null, empregado.toString());
        JOptionPane.showMessageDialog(null, professor.toString());
    }
    
}
