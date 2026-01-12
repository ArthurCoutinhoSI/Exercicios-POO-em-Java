/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimedadosdodiretorio;

import java.io.File;
import java.io.FileReader;
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
        
    //  versao com pacote java.io
        String s = JOptionPane.showInputDialog("Informe um caminho de um diretório", "C:\\Users\\Arthur Coutinho\\projects\\pc velho NetBeansProjects\\Banco\\src\\banco");
        File arquivo = new File(s);

        for (File file : arquivo.listFiles()) {
            System.out.println("Nome do arquivo: "
                    + file.getName() + "\n");
            try {
                FileReader leitor = new FileReader(file);
                System.out.println("Conteúdo: " + leitor.readAllAsString() + "\n\n");
            } catch (Exception e) {
                System.err.println("deu errado aqui ó!");
            }
        }
    }    
}
