/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animaisnamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Galinha extends Animal{

    public Galinha() {
    }
    
    @Override
    public void barulho(){
        JOptionPane.showMessageDialog(null, "pó popopopopoPÓ...");
    }
}
