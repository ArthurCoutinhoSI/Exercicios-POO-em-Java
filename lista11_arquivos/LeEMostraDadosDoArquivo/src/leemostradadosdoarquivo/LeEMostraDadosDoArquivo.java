/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leemostradadosdoarquivo;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Arthur Coutinho
 */
public class LeEMostraDadosDoArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 4: []
//Faça um programa que dado um caminho (via teclado), leia o conteúdo do arquivo e imprima o conteúdo na tela.
//Utilize o arquivo gerado no exercício anterior.
        
        try {
            FileReader arquivo = new FileReader("..\\DigitaTabuadaDeUmNumeroNoArquivoEspecifico\\OutputDaTabuada.txt");
            
            int valor;
            while((valor = arquivo.read()) != -1){
                System.out.print((char) valor);
            }
            
        } catch (IOException ioe) {
            System.err.println("deu pau!!");
        }
        
    }
    
}
