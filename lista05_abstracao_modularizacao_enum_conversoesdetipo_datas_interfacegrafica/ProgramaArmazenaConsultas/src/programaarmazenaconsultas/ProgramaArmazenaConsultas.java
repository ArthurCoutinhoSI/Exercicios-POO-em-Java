/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programaarmazenaconsultas;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaArmazenaConsultas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rodaMenu();
        //nao foi feito o tratamento de erros da alteração
        //caso o usuario tente alterar uma consulta inexiste, ele consegue kkkkk
    }
    
    public static void rodaMenu(){
        String operacao;
        Consulta consulta = null;
        
        do {       
            
            operacao = JOptionPane.showInputDialog(MenuConsulta.toStringMenuConsulta(), "1");

            if(Integer.parseInt(operacao) == MenuConsulta.CRIAR_CONSULTA.getValorMenuConsulta()){
                consulta = Consulta.criarConsulta();
            }else if(Integer.parseInt(operacao) == MenuConsulta.ALTERAR_DADOS_PESSOAIS.getValorMenuConsulta()){
                consulta.setPaciente(Pessoa.criarPessoa());
            }else if(Integer.parseInt(operacao) == MenuConsulta.ALTERAR_DATA.getValorMenuConsulta()){
                consulta.setData(Consulta.solicitaData());
            }else if(Integer.parseInt(operacao) == MenuConsulta.ALTERAR_HORA.getValorMenuConsulta()){
                consulta.setHora(Consulta.solicitaHora());
            }else if(Integer.parseInt(operacao) == MenuConsulta.SAIR.getValorMenuConsulta()){
                //nada é feito
            }else
                JOptionPane.showMessageDialog(null, "Não existe operação correspondente a esta escolha");

            
        } while (Integer.parseInt(operacao) != MenuConsulta.SAIR.getValorMenuConsulta());
    }
    
    
    
}