/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaemissaocarbono;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Veiculo implements EmissaoCarbono{
    private int numeroDeCilindros;
    private int rotacoesPorMinutoMotor;
    private int fatorDePoluicao;

    public Veiculo(){
        this.solicitaEAtualizaDados();
    }
    
    private void solicitaEAtualizaDados(){
        String numeroDeCilindrosString = JOptionPane.showInputDialog("Informe a quantidade de cilindros do motor do carro", "3 cilindros");
        String rotacoesPorMinutoString = JOptionPane.showInputDialog("informe o numero de rotações por minuto do carro", "2000 rotações");
        String fatorDePoluicaoString = JOptionPane.showInputDialog("informe o combustível utilizado no carro (alcool, gasolina, diesel)", "alcool");
        
        numeroDeCilindrosString = numeroDeCilindrosString.replaceAll("\\D+", "");
        rotacoesPorMinutoString = rotacoesPorMinutoString.replaceAll("\\D+", "");
        
        numeroDeCilindros = Integer.parseInt(numeroDeCilindrosString);
        rotacoesPorMinutoMotor = Integer.parseInt(rotacoesPorMinutoString);
        if(fatorDePoluicaoString.equalsIgnoreCase("alcool")){
            fatorDePoluicao = 1;
        }
        if(fatorDePoluicaoString.equalsIgnoreCase("gasolina")){
            fatorDePoluicao = 2;
        }
        if(fatorDePoluicaoString.equalsIgnoreCase("diesel")){
            fatorDePoluicao = 3;
        }
        
    }
    
    public double calculaEmissao(){
        return numeroDeCilindros*(rotacoesPorMinutoMotor/1000)*fatorDePoluicao;
    }
    
}
