/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package validacaodetelefonergcpf;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ValidacaoDeTelefoneRgCpf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 7: []
//Faça um programa que peça para o usuário digitar os seguintes campos: Nome, Telefone, CPF e CEP. Todos esses
//campos devem ser validados com expressões regulares. A string do campo nome só deve possuir letras ou espaços
//em branco. O formato do campo telefone deve ser (##)#####-####, do CPF deve ser ###.###.###-##, e do
//CEP deve ser #####-###. O usuário só poderá digitar o próximo campo se o campo atualmente sendo digitado
//for válido.
        String nome = pedeNomeAteDarMatch();
        String telefone = pedeTelefoneAteDarMatch();
        String cpf = pedeCpfAteDarMatch();
        String rg = pedeRgAteDarMatch();
        
        Pessoa pessoa = new Pessoa(nome, telefone, cpf, rg);
        JOptionPane.showMessageDialog(null, "pessoa recebida com sucesso\n" + pessoa.toString());
        
    }
    public static String pedeNomeAteDarMatch(){
        String nome;
        String message = "Informe um nome";
        do{
            nome = JOptionPane.showInputDialog(message);
            if (!nome.matches("[(\\w|\\s)]+")) {
                JOptionPane.showMessageDialog(null, "(são permitidas apenas letras e espaços em branco)");
            }
        }while(!nome.matches("[(\\w|\\s)]+"));
        return nome;
    }
    
    public static String pedeTelefoneAteDarMatch(){
        String telefone;
        do{
            telefone = JOptionPane.showInputDialog("Informe um telefone válido", "(##)#####-####");
        }while(!telefone.matches("[(]\\d{2}[)]\\d{5}-\\d{4}"));
        return telefone;
    }
    
    public static String pedeCpfAteDarMatch(){
        String cpf;
        do{
            cpf = JOptionPane.showInputDialog("Informe um CPF válido", "###.###.###-##");
        }while(!cpf.matches("\\d\\d\\d\\.\\d\\d\\d\\.\\d\\d\\d-\\d\\d"));
        return cpf;
    }
    
    public static String pedeRgAteDarMatch(){
        String cpf;
        do{
            cpf = JOptionPane.showInputDialog("Informe um RG válido", "#####-###");
        }while(!cpf.matches("\\d{4}-\\d{3}"));
        return cpf;
    }

}
