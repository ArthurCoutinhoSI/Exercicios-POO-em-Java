/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contavendascomhistograma;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ClasseDeVenda {
    private int limiteInferior;
    private int limiteSuperior;
    ArrayList<Double> vendas = new ArrayList<Double>();

    public ClasseDeVenda(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }
    
    public static String solicitaVenda(){
        return JOptionPane.showInputDialog("Informe o preço da venda efeturada"
                + "\n"
                + "informe -1 para finalizar o cadastro das vendas");
    }
    
    public boolean insereNaClasseOuNao(Double valor){
        if (valor >= this.getLimiteSuperior()
                || valor < this.getLimiteInferior()) {
            return false;
        }else{
            this.getVendas().add(valor);
        }
        return true;
    }
    
    public String retornaSuaParteDoHistograma(){
        String resp = "";
        
        resp += "[" + getLimiteInferior() +
                "-" + getLimiteSuperior() +"[: ";
        
        for (Double venda : getVendas()) {
            resp += "*"; 
        }
        resp += "\n";
        return resp;
    }
    
    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public ArrayList<Double> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Double> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "ClasseDeVenda{" + "limiteInferior=" + limiteInferior + ", limiteSuperior=" + limiteSuperior + ", vendas=" + vendas + '}';
    }
    
    
    
}
