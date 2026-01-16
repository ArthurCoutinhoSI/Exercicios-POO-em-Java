/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package extraiconteudodetagshtml;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ExtraiConteudoDeTagsHtml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 8: []
//O HTML é uma linhagem de marcação na qual o texto é formatado utilizando tags. Por exemplo, o conteúdo entre
//as tags <i> e </i> é exibido em itálico e os conteúdos entre as tags <b> e </b> são exibidos em negrito. Faça um
//programa que dado o seguinte trecho em HTML “A disciplina de <i>Programação Orientada a Objetetos</i>
//está sendo ministrada no primeiro semestre de 2022 de modo <b>híbrido</b>.”, extraia todos os conteúdos entre
//as tags de formatação. Faça isso utilizando uma única expressão regular.
//PS: no exemplo acima, o conteúdo a ser extraído é “ Programação Orientada a Objetetos” e “híbrido”.
        
        String entrada = JOptionPane.showInputDialog("Informe um trecho de texto com tags html no meio", 
                "A disciplina de <i>Programação Orientada a Objetetos</i> "
                + "está sendo ministrada no primeiro semestre de 2022 de modo <b>híbrido</b>.");
        
       String[] saida = entrada.split("(<\\w|</\\w>)");
       
        mostraTags(saida);
    }

    public static void mostraTags(String[] saida){
        
        for (int i = 0; i < saida.length; i++) {
            if(saida[i].charAt(0) == '>'){
                saida[i] = saida[i].substring(1);//remove o primeiro charactere
                JOptionPane.showMessageDialog(null, saida[i]);
            }
        }
    }

}
