/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usafilechooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.swing.JFileChooser;

/**
 *
 * @author Arthur Coutinho
 */
public class UsaFileChooser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
//Questão 6: []
//Repita o exercício anterior só que o diretório deve ser informado por meio do utilizando a classe JFileChooser
//e, além do nome do arquivo, devem ser exibidos o tamanho do arquivo e a data da última modificação.
        
        //  versao com pacote java.nio
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int retorno = fileChooser.showOpenDialog(null);
        if (retorno == JFileChooser.CANCEL_OPTION) {
            System.out.println("O usuario clicou em CANCELAR");
            return;
        }
        
        File arquivo = fileChooser.getSelectedFile();

        File[] files = arquivo.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            
            System.out.println("Nome do arquivo: "
                    + file.getName() + "\n");
            
            System.out.println("Tamanho do arquivo: "
                    + file.length()+ "\n");
            
            Instant ultimaModificacao = Instant.ofEpochMilli(file.lastModified());
            System.out.println("ltima modificação do arquivo: "
                    + ultimaModificacao + "\n");
            
            try (BufferedReader leitor = new BufferedReader( new FileReader(file))) {
                System.out.println("Conteúdo: " + leitor.readAllAsString() + "\n\n");
                
            } catch (IOException ioe) {
                System.err.println("deu errado aqui ó!");
            }
        }
    }  
    
}
