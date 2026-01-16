/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programarelogio;

import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Temporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entradaHorario = JOptionPane.showInputDialog(null,
                "Informe um horario no padrao hh:mm:ss");
        
        LocalTime horario = LocalTime.parse(entradaHorario);
        
        temporizador(horario);
        System.out.println("ACABOU A CONTAGEM!!!");
    }
    
    public static void temporizador(LocalTime tempo){
        while (tempo.getHour() != 0 ||
                tempo.getMinute() != 0 ||
                tempo.getSecond() != 0) {
            
            tempo = tempo.minusSeconds(1);
            System.out.println(tempo.toString());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.err.println("Erro ao atualizar o temporizador");
                System.exit(0);
            }
                        
        }
        
    }
}