/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exanteriormasconsideradiretorios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import javax.swing.JFileChooser;

/**
 *
 * @author Arthur Coutinho
 */
public class ExAnteriorMasConsideraDiretorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 7: []
//Repita o exercício anterior só que agora considere que o diretório informado pelo usuário possui outros diretórios
//dentro dele, que por sua vez possuem arquivos texto. Imprima na tela o nome do arquivo e os conteúdos dos arquivos
//de todos os diretórios. Considere o arquivo da primeira etapa do “Projeto Banco” para realizar o exercício.
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int retorno = fileChooser.showOpenDialog(null);
        if (retorno == JFileChooser.CANCEL_OPTION) {
            System.out.println("O usuario clicou em CANCELAR");
            return;
        }
        
        File arquivo = fileChooser.getSelectedFile();

        File[] files = arquivo.listFiles();
        mostraDadosDosArquivosDoDiretorio(files);
        
    }
    
    public static void mostraDadosDosArquivosDoDiretorio(File[] files){
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            
            if (file.getName().matches("\\.git([\\w])*")){
                //ignora todos os arquivos e diretorios que começam com .git
            }else if (file.isDirectory()) {
                
                System.out.println("Diretorio: "
                        + file.getName());
                File[] diretorio = file.listFiles();
                
                System.out.println(Arrays.toString(diretorio) + "\n");
                
                mostraDadosDosArquivosDoDiretorio(diretorio);
            }else{
                mostraInfoDoArquivo(file);
            }           
        }
    }
    
    public static void mostraInfoDoArquivo(File file){
        System.out.println("Nome do arquivo: "
                        + file.getName());

                System.out.println("Tamanho do arquivo: "
                        + file.length());

                Instant ultimaModificacao = Instant.ofEpochMilli(file.lastModified());
                System.out.println("ultima modificação do arquivo: "
                        + ultimaModificacao);
                
                try (BufferedReader leitor = new BufferedReader( new FileReader(file))) {
                System.out.println("Conteúdo: \n" + leitor.readAllAsString() + "\n"
                        + "--------------------------------------------------------\n");

                } catch (IOException ioe) {
                    System.err.println("deu errado aqui ó!");
                }
    }
    
}
