/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregadorendaliquidamain;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class LeInformacoesDoEmpregado {
    public static Empregado leAtributosDoUsuario(){
        Scanner scanner = new Scanner(System.in);
        double salarioBruto;
        String nome;
        
        System.out.println("Informe o nome do empregado");
        nome = scanner.next();
        System.out.println("Informe o salario bruto do empregado");
        salarioBruto = scanner.nextDouble();
        
        Empregado empregado = new Empregado(nome, salarioBruto);
        
        return empregado;
    }

}
