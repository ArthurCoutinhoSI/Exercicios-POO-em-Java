/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corrigindoautordealgunsprojetosnomeudiretoriodogithub;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Arthur Coutinho
 */
public class CorrigindoAutorDeAlgunsProjetosNoMeuDiretorioDoGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        codigo feito para corrigir o campo @author do presente diretorio.
//        quanto eu comecei a fazer esses exercicios, era periodo de férias e eu fiz no 
//        notebook emprestado, portanto, o nome do autor nos arquivos estão inconsistentes.
//        vamos arrumar isso!
        
        File diretorio = new File("..\\");
        
        buscaArquivos(diretorio);
    }
    
    public static void buscaArquivos(File diretorio){
        for (File file : diretorio.listFiles()) {
            if (diretorio.getName().startsWith(".git")) {
                //ignora o .git do repositorio
                continue;
            }            
            
            if (file.isDirectory()) {
                buscaArquivos(file);
            }
            
            if (file.isFile()) {
                alteraAutorDoArquivoDotJavaNaForcaBruta(file);
            }
        }
    }
    
    public static void alteraAutorDoArquivoDotJavaNaForcaBruta(File file){
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader arquivo = new BufferedReader(new FileReader(file))){
            
            conteudo.append(arquivo.readAllAsString());

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        conteudo.replace(0, conteudo.length() ,conteudo.toString().replaceAll("Arthur Coutinho", "Arthur Coutinho"));
        
        try (BufferedWriter arquivo = new BufferedWriter(new FileWriter(file))){
            
            arquivo.write(conteudo.toString());
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
