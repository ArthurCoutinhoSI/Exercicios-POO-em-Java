/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaemissaocarbono;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaEmissaoCarbono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<EmissaoCarbono> listaDeEmissores = new ArrayList<EmissaoCarbono>();
        
        insereEmissores(listaDeEmissores);
        mostraEmissao(listaDeEmissores);
    }
    
    public static void insereEmissores(ArrayList<EmissaoCarbono> emissores){
        String desejaContinuar = "sim";
        while(desejaContinuar.matches("((s|S)im|s|S|1|true)")){
            String entrada = JOptionPane.showInputDialog("qual emissor vc quer inserir? construcao, veiculo ou gado?");
            if(entrada.equalsIgnoreCase("construcao"))
                emissores.add(new Construcao());
            else if(entrada.equalsIgnoreCase("veiculo"))
                emissores.add(new Veiculo());
            else if(entrada.equalsIgnoreCase("gado"))
                emissores.add(new Gado());
            else
                JOptionPane.showMessageDialog(null, "emissor não reconhecido dentre as opções");
            
            desejaContinuar = JOptionPane.showInputDialog("Deseja cadastrar mais emissores?", "sim");
        }
    }
    
    public static void mostraEmissao(ArrayList<EmissaoCarbono> emissores){
        double soma = 0;
        for (EmissaoCarbono emissore : emissores) {
            soma += emissore.calculaEmissao();
        }
        JOptionPane.showMessageDialog(null, "Emissões totais: " + soma + "g de carbono");
    }
}
