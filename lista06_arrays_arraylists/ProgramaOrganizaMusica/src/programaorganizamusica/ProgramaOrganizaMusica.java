/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programaorganizamusica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaOrganizaMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 12: []
//Faça um sistema para organizar as suas músicas. Como ainda não sabemos manipular arquivos, vamos considerar 
//que cada música tenha apenas um título, um artista e um gênero. O sistema deve permitir que o usuário cadastre
//as músicas, liste todas as músicas, procure por uma música (neste caso pode procurar tanto por título, gênero ou
//artista) e também que remova uma música (podendo também remover uma música de acordo com o título, gênero
//ou nome do artista). Para facilitar a comparação das consultas do usuário como as informações das músicas, utilize
//o método contains(...) da classe String. Se qualquer trecho da string de referência contiver a sequência de
//caracteres passada para o método, o retorno desse método será true.
        
        ArrayList<Musica> musicas = new ArrayList<Musica>();
        
        rodaMenuEnquantoNaoSair(musicas);
    }
    
    public static void rodaMenuEnquantoNaoSair(ArrayList<Musica> musicas){
        String entrada = JOptionPane.showInputDialog(MenuMusica.toStringMenu(), "1");
        while(!"5".equals(entrada)){
            switch (entrada) {
                case "1"://cadastraMusica
                    musicas.add(Musica.criaMusica());
                    break;
                case "2"://lista todas as musicas
                    JOptionPane.showMessageDialog(null,
                            Musica.devolveStringDeTodasAsMusicas(musicas));
                    break;
                case "3"://procura musica com base em qualquer um de seus atributos
                    JOptionPane.showMessageDialog(null, 
                            Musica.devolveStringDeTodasAsMusicas(
                                    procuraMusicas(musicas)));
                    break;
                case "4"://remove musica com base em qualquer um de seus atributos
                    JOptionPane.showMessageDialog(null, 
                            Musica.removeMusicas(
                                    procuraMusicas(musicas)));
                    break;
                case "5"://sair
                    JOptionPane.showMessageDialog(null, "Fechando o programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor "
                            + entrada
                            + " não corresponde à nenhuma ação");
            }
                    
            entrada = JOptionPane.showInputDialog(MenuMusica.toStringMenu(), "1");
        }
    }
    
//    issue
     public static ArrayList<Musica> procuraMusicas(ArrayList<Musica> musicas){
         String filtro = JOptionPane.showInputDialog(
                MenuFiltroMusica.toStringMenu(), "1");
        int filtroInt = Integer.parseInt(filtro);
        String buscada = JOptionPane.showInputDialog("Informe a paravra de busca");
        
        return Musica.musicasFitradas(musicas, filtroInt, buscada);
     }
}
