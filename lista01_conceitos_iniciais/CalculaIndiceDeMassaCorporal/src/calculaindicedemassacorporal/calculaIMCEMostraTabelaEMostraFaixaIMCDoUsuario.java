/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculaindicedemassacorporal;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class calculaIMCEMostraTabelaEMostraFaixaIMCDoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double indiceDeMassaCoporal;//IMC
        double massa;
        double altura;
        //lê massa e altura
        System.out.println("Informe a sua massa");
        massa = scanner.nextDouble();
        
        System.out.println("Informe a sua altura");
        altura = scanner.nextDouble();
        
        //calcula IMC
        indiceDeMassaCoporal = recebeMassaAlturaEDevolveIMC(massa,altura);
        
        //mostra tabela
        System.out.println(constroiTabelaDeFaixaIMC());
        
        //mosra a determinada faixa do IMC o usuário se encaixa
        System.out.println("IMC = "
                + indiceDeMassaCoporal + "\n"
                + recebeIMCEDevolveFaixaIMCCorrespondente(indiceDeMassaCoporal));
    }

    public static double recebeMassaAlturaEDevolveIMC(double massa, double altura){
        double IMC = massa/(altura*altura);
        return IMC;
    }
    
    public static String constroiTabelaDeFaixaIMC(){
        String tabelaIMC;
        tabelaIMC = ""
                + "IMC\tClassificacao\n"
                + "< 16\tMagreza grave\n"
                + "16 a < 17\tMagreza moderada\n"
                + "17 a < 18,5\tMagreza leve\n"
                + "18,5 a < 25\t Saudavel\n"
                + "25 a < 30\tSobrepeso\n"
                + "30 a < 35\tObesidade Grau I\n"
                + "35 a < 40\tObesidade Grau II(severa)\n"
                + ">= 40\tObesidade Grau III(morbida)\n";
        
//        System.out.println(tabelaIMC);
        return tabelaIMC;
    }
    
    public static String recebeIMCEDevolveFaixaIMCCorrespondente(double IMC){
        String faixaIMC = "erro na recebeIMCEDevolveFaixaIMCCorrespondente";
        
        if (IMC < 16) {
            faixaIMC = "Magreza grave";
            return faixaIMC;
        }
        if(IMC < 17){
           faixaIMC = "Magreza moderada";
           return faixaIMC;
        }
        if(IMC < 18.5){
           faixaIMC = "Magreza leve";
           return faixaIMC;
        }
        if(IMC < 25){
           faixaIMC = "Saudavel";
           return faixaIMC;
        }
        if(IMC < 30){
           faixaIMC = "Sobrepeso";
           return faixaIMC;
        }
        if(IMC < 35){
           faixaIMC = "Obesidade Grau I";
           return faixaIMC;
        }
        if(IMC < 40){
           faixaIMC = "Obesidade Grau II(severa)";
           return faixaIMC;
        }
        if(IMC >= 40){
           faixaIMC = "Obesidade Grau III(morbida)";
           return faixaIMC;
        }
        
        return faixaIMC;
    }    
}
