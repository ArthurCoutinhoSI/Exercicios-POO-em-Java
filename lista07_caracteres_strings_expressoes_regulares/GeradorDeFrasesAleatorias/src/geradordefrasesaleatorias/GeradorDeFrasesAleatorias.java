/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package geradordefrasesaleatorias;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class GeradorDeFrasesAleatorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        Questão 4: []
//Escreva um aplicativo que utiliza geração de números aleatórios para criar frases. Utilize quatro arrays de strings
//chamados artigos, substantivos, verbos e preposições.
    //• O array de artigos deve conter os artigos “o”, “um”, “algum” e “qualquer”;
    //• O array de substantivos deve conter os substantivos “cara”, “cachorro”, “cidade” e “carro”;
    //• O array de verbos deve ter “dirigiu”, “pulou”, “correu”, “andou” e “escapou”;
    //• O array de preposições deve conter as preposições “para”, “de”, “sobre” e “em”.
//O aplicativo deve gerar 20 frases aleatórias seguindo o padrão artigo, substantivo, verbo, preposição, artigo e
//substantivo. Cada frase deve ser um StringBuilder e ao serem selecionados os elementos das frases deve-se
//utilizar o método append da classe StringBuilder para ir construindo a frase. Exiba as 20 frases criadas na
//tela. Quando a frase final for enviada para a saída, ela deve iniciar com uma letra maiúscula e terminar com um
//ponto final.

        String[] artigos = {"o", "um", "algum", "qualquer"};
        String[] substantivos = {"cara", "cachorro", "cidade", "carro"};
        String[] verbos = {"dirigiu", "pulou", "correu", "andou", "escapou"};
        String[] preposicoes = {"para", "de", "sobre", "em"};
        
        
        for (int i = 0; i < 20; i++) {
            StringBuilder frase = new StringBuilder();
            Random random = new Random();
            int indiceAleatorio;
            
//            essa sequencia ficou pacada mas não tem como fazer um laço disso
            indiceAleatorio = random.nextInt() % 4;
            indiceAleatorio = indiceAleatorio<0?indiceAleatorio*-1:indiceAleatorio;//garante que o indiceAleatorio é positivo
            frase.append(artigos[indiceAleatorio]);
            frase.append(" ");
            
            indiceAleatorio = random.nextInt() % substantivos.length;//fiz com o length só pra mostrar q pode
            indiceAleatorio = indiceAleatorio<0?indiceAleatorio*-1:indiceAleatorio;
            frase.append(substantivos[indiceAleatorio]);
            frase.append(" ");
            
            indiceAleatorio = random.nextInt() % 4;
            indiceAleatorio = indiceAleatorio<0?indiceAleatorio*-1:indiceAleatorio;
            frase.append(verbos[indiceAleatorio]);
            frase.append(" ");
                        
            indiceAleatorio = random.nextInt() % 4;
            indiceAleatorio = indiceAleatorio<0?indiceAleatorio*-1:indiceAleatorio;
            frase.append(preposicoes[indiceAleatorio]);
            frase.append(" ");
            
            indiceAleatorio = random.nextInt() % 4;
            indiceAleatorio = indiceAleatorio<0?indiceAleatorio*-1:indiceAleatorio;
            frase.append(artigos[indiceAleatorio]);
            frase.append(" ");
            
            indiceAleatorio = random.nextInt() % 4;
            indiceAleatorio = indiceAleatorio<0?indiceAleatorio*-1:indiceAleatorio;
            frase.append(substantivos[indiceAleatorio]);
            frase.append(".");
            
            //deixando a primeira letra maiuscula
            frase.setCharAt(0, Character.toUpperCase(frase.charAt(0)));
            
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}
