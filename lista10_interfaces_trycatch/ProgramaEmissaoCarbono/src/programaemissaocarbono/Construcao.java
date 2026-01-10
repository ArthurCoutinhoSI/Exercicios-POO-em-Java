/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaemissaocarbono;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Construcao implements EmissaoCarbono{
    private ArrayList<Chamineh> chaminehs = new ArrayList<Chamineh>();
    private int numeroChaminehs;

    public Construcao() {
        this.solicitaEAtualizaDados();
    }
    
    private void solicitaEAtualizaDados(){
        String desejaContinuar = "sim";
        while(desejaContinuar.matches("((s|S)im|s|S|1|true)")){
            chaminehs.add(new Chamineh());
            desejaContinuar = JOptionPane.showInputDialog("Deseja cadastrar mais chamines à construção?", "sim");
        }
        numeroChaminehs = chaminehs.size();
    }
    
    public double calculaEmissao(){
        double emissao = 0;
        
        for (Chamineh chamineh : chaminehs) {
            emissao += chamineh.larguraChamineh * chamineh.indiceDeAtividade;
        }
        
        return emissao;
    }
    
    public class Chamineh{
        private double larguraChamineh;
        private double indiceDeAtividade;

        public Chamineh(){
            this.solicitaEAtualizaDados();
        }
        
        private void solicitaEAtualizaDados(){
            String larguraChaminehString = JOptionPane.showInputDialog("Informe a Largura da chamineh", "30 centimetros");
            String indiceDeAtividadeString = JOptionPane.showInputDialog("informe o indice de atividade (deve ser um valor entre 10 e 1000)", "300");
            
            larguraChaminehString = larguraChaminehString.replaceAll("\\D+", "");
            
            larguraChamineh = Double.parseDouble(larguraChaminehString);
            indiceDeAtividade = Double.parseDouble(indiceDeAtividadeString);
        }
    }
    
}
