/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package funcionariosalariototal;

/**
 *
 * @author Arthur
 */
public class FuncionarioSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 13: []
//Crie uma classe Funcionario. Essa classe deve conter um campo nome (String), salarioBase (double),
//totalVendas (double) e taxaComissao (double). Essa classe deve implementar um método imprimeSalarioTotal(),
//
//que irá imprimir o salário total do funcionário. O salário total é o salário base somado ao total de vendas multi-
//plicado pela comissão. Faça uma outra classe que crie um objeto Funcionario, com valores definidos por você e
//
//invoque o método imprimeSalarioTotal(), para imprimir o salário total do funcionário no terminal. O valor
//do salário total deve ser formatado (apenas duas casas decimais).
        
        Funcionario funcionario = new Funcionario("arthur", 1250.5, 0.33);
        
        funcionario.imprimeSalarioTotal();
    }

}
