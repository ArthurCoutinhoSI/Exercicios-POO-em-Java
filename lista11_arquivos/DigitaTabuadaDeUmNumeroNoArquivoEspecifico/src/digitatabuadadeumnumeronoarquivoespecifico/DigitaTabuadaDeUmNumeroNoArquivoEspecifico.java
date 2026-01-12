/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitatabuadadeumnumeronoarquivoespecifico;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class DigitaTabuadaDeUmNumeroNoArquivoEspecifico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
            
            String pathString = JOptionPane.showInputDialog("informe um caminho de arquivo", ".\\OutputDaTabuada.txt");
            FileWriter arquivo = new FileWriter(pathString);
            
            String s = JOptionPane.showInputDialog("informe um numero para escrever a tabuada no caminho especificado", "43");
            int n = Integer.parseInt(s);
            
            for (int i = 0; i < 10; i++) {
                arquivo.write(n + " X " + (i + 1) + " = " + (n * i + 1) + "\n");
            }
            arquivo.close();
            
        } catch (IOException ioe) {
            System.err.println("houve erro ao gravar o arquivo");
        }
    }
    
}
