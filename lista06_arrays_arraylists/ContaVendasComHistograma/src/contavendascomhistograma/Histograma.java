/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contavendascomhistograma;

import static contavendascomhistograma.ClasseDeVenda.solicitaVenda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Histograma {
    private ClasseDeVenda primeiraClasse = new ClasseDeVenda(0, 300);
    private ClasseDeVenda segundaClasse = new ClasseDeVenda(300, 600);
    private ClasseDeVenda terceiraClasse = new ClasseDeVenda(600, 900);
    private ClasseDeVenda quartaClasse = new ClasseDeVenda(900, 1200);
    private ClasseDeVenda ultimaClasse = new ClasseDeVenda(1200, 1500);
    private ArrayList<Double> todasAsVendas = new ArrayList<Double>();

    public Histograma() {
    }
    
    public void recebeVariasVendas(){
        String entrada = solicitaVenda();
        
        while (entrada != null && Integer.parseInt(entrada) != -1) { 
            Double valor = Double.valueOf(entrada);
            
            if (valor >= getUltimaClasse().getLimiteSuperior()
                    || valor < getPrimeiraClasse().getLimiteInferior() ) {
                
                JOptionPane.showMessageDialog(null, ""
                        + "não é aceito valores menores que R$"
                        + getPrimeiraClasse().getLimiteInferior()
                        + " ou valores maiores ou iguais a R$"
                        + getUltimaClasse().getLimiteSuperior());
                
            }else{
                
                getTodasAsVendas().add(valor);
                tentaInserirEmTodasAsClasses(valor);
                JOptionPane.showMessageDialog(null, "Venda Registrada");
            }

            entrada = solicitaVenda();
        }
    }
    
    public void tentaInserirEmTodasAsClasses(Double valor){
        this.getPrimeiraClasse().insereNaClasseOuNao(valor);
        this.getSegundaClasse().insereNaClasseOuNao(valor);
        this.getTerceiraClasse().insereNaClasseOuNao(valor);
        this.getQuartaClasse().insereNaClasseOuNao(valor);
        this.getUltimaClasse().insereNaClasseOuNao(valor);
    }

    public ClasseDeVenda getPrimeiraClasse() {
        return primeiraClasse;
    }
    
    public ClasseDeVenda getSegundaClasse() {
        return segundaClasse;
    }

    public ClasseDeVenda getTerceiraClasse() {
        return terceiraClasse;
    }

    public ClasseDeVenda getQuartaClasse() {
        return quartaClasse;
    }

    public ClasseDeVenda getUltimaClasse() {
        return ultimaClasse;
    }
    
    public ArrayList<Double> getTodasAsVendas() {
        return todasAsVendas;
    }

    @Override
    public String toString() {
        String histograma = "";
        
        histograma += getPrimeiraClasse().retornaSuaParteDoHistograma();
        histograma += getSegundaClasse().retornaSuaParteDoHistograma();
        histograma += getTerceiraClasse().retornaSuaParteDoHistograma();
        histograma += getQuartaClasse().retornaSuaParteDoHistograma();
        histograma += getUltimaClasse().retornaSuaParteDoHistograma();
        
        return histograma;
    }
    
}
