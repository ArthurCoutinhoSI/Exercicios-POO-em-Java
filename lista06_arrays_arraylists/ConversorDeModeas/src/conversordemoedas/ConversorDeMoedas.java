/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package conversordemoedas;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ConversorDeMoedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String opcoesDeMoedaParaConversao = "1- Dólar\n2- Euro\n3- Won";
        String entrada = JOptionPane.showInputDialog("informe uma quantidade de dinheiro em reais", "1518.18");
        double reais = Double.parseDouble(entrada);
        
        
        entrada = JOptionPane.showInputDialog("Selecione uma moeda para fazer a conversão:\n"
                + opcoesDeMoedaParaConversao, "2");
        int moedaParaConversao = Integer.parseInt(entrada);
        
        JOptionPane.showMessageDialog(null, fazConversaoEspecifica(moedaParaConversao, reais));
        
        
    }
    
    public static String fazConversaoEspecifica (int moedaSelecionada, double valorEmReais){
        String resp = "";
                
        //hoje é 30/12/2025. O real vale:
        //0,18 dolar
        //0,15 euro
        //262,62 won
        if (moedaSelecionada == 1) {//dolar
            NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
            resp += format.format(valorEmReais * 0.18);
        }
        if (moedaSelecionada == 2) {//euro
            NumberFormat format = NumberFormat.getCurrencyInstance(Locale.GERMANY);
            resp += format.format(valorEmReais * 0.15);
        }
        if (moedaSelecionada == 3) {//won
            NumberFormat format = NumberFormat.getCurrencyInstance(Locale.KOREA);
            resp += format.format(valorEmReais * 262.62);
        }
        
        return resp;
    }

}
