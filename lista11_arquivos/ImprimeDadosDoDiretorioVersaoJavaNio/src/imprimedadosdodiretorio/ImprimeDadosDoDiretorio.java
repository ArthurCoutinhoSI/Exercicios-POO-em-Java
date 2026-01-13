/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimedadosdodiretorio;

import java.nio.file.*;
import java.util.Iterator;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ImprimeDadosDoDiretorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 5: []
//Faça um programa que dado um diretório (via teclado), imprima na tela o nome do arquivo e o conteúdo de cada
//arquivo do diretório. Para isso utilize os textos do arquivo da primeira etapa do “Projeto Banco” que ficam dentro
//da pasta “src/”. Faça uma vez o exercício utilizando classes do pacote java.io, e depois repita utilizando classes
//do pacote java java.nio.
        
    //  versao com pacote java.nio
        String s = JOptionPane.showInputDialog("Informe um caminho de um diretório", ""
                + "C:\\Users\\Arthur Coutinho\\projects\\pc velho NetBeansProjects\\Banco\\src\\banco");
        Path path = Paths.get(s);
        
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            Iterator<Path> iterator = stream.iterator();
            
            while (iterator.hasNext()) {
                Path next = iterator.next();
                
                System.out.println("Nome do arquivo: "
                        + next.getFileName() + "\n");
                try {
                    System.out.println("Conteúdo: \n\n" + Files.readString(next) + "\n\n");
                } catch (Exception e) {
                    System.err.println("deu errado aqui ó!");
                }
            }
        } catch (Exception e) {
            System.err.println("deu errado ó!");
        }
    }    
}
