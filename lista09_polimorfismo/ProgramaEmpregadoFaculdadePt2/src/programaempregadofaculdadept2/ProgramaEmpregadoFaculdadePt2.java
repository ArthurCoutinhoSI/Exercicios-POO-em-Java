/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaempregadofaculdadept2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaEmpregadoFaculdadePt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 6: []
//Crie uma classe EmpregadoFaculdade. Essa classe deve conter os campos nome (String) e salarioBase
//(double). Essa classe deve conter um método abstract calculaSalario(). Implemente uma classe
//FuncionarioFaculdade, que deve estender a classe EmpregadoFaculdade. Além disso, a classe
//FuncionarioFaculdade deve possuir o campo setor (String) além de implementar o método
//calculaSalario(), que no caso do FuncionarioFaculdade, retorna apenas o salarioBase. Implemente
//uma classe DocenteFaculdade, a qual estende a classe FuncionarioFaculdade e deve acrescentar os cam-;
//pos qtdHorasAula (int) e valorHoraAula (double). Implemente a classe calculaSalario(), sendo que
//o salário do docente é o salarioBase + (qtdHorasAula * valorHoraAula). Faça uma classe principal
//que contenha um método main, que peça para o usuário inserir informações sobre os funcionários (tipo, nome,
//salário e demais informações de acordo com o tipo de objeto). Após ler essas informações, crie os objetos cor-
//respondentes e adicione-os em um ArrayList<EmpregadoFaculdade>. A cada novo funcionário adicionado,
//deve-se percorrer o ArrayList e calcular o gasto total com folha de pagamento com os funcionários cadastrados.
        
        ArrayList<EmpregadoFaculdade> empregados = new ArrayList<EmpregadoFaculdade>();
        
        String desejaContinuar = "sim";
        while(desejaContinuar.matches("((s|S)im|s|S|1|true|é|É|eh|e|(Y|y)es)")){
            empregados.add(solicitaDadosEmpregado());
            mostraGastoTotalComFolhaDePagamento(empregados);
            desejaContinuar = JOptionPane.showInputDialog("Deseja adicionar mais empregados?");            
        }
        
    }
    
    public static EmpregadoFaculdade solicitaDadosEmpregado(){
        String nome = JOptionPane.showInputDialog("informe o nome do empregado", "Arthur");
        String salarioBaseString = JOptionPane.showInputDialog("informe o salario base do empregado", "3000.00");
        String setor = JOptionPane.showInputDialog("informe o setor o qual o funcionario trabalha");
        String professorConfirmString = JOptionPane.showInputDialog("o empregado é professor?", "sim");
        
        double salarioBase = Double.parseDouble(salarioBaseString);
        
        if (!professorConfirmString.matches("((s|S)im|s|S|1|true|é|É|eh|e|(Y|y)es)")) {
            return new FuncionarioFaculdade(setor, nome, salarioBase);
        }
        
        String qtdHoraAulaString = JOptionPane.showInputDialog("informe quantas horas o professor deu aula esse mês", "40");
        String valorHoraAulaString = JOptionPane.showInputDialog("informe quantas horas o professor deu aula esse mês", "40.0");
        int qtdHoraAula = Integer.parseInt(qtdHoraAulaString);
        double valorHoraAula = Double.parseDouble(valorHoraAulaString);
        
        return new DocenteFaculdade(qtdHoraAula, valorHoraAula, setor, nome, salarioBase);
    }
    
    public static void mostraGastoTotalComFolhaDePagamento(ArrayList<EmpregadoFaculdade> empregados){
        double folhaDePagamento = 0;
        for (EmpregadoFaculdade empregado : empregados) {
            folhaDePagamento += empregado.calculaSalario();
        }
        JOptionPane.showMessageDialog(null, "Gasto total com folha de pagamento:\n"
                + folhaDePagamento);
    }
    
}
