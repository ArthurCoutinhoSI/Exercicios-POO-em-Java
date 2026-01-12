
package banco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author humberto.antonelli
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacao op = new Operacao();
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        boolean sair = false;
        do{
	    Menu operacao = op.selecionarOpcao();
           
            switch(operacao){
                case CRIAR -> op.criarContaBancaria(contas);
                case DEPOSITAR -> op.depositar(contas);
                case SACAR -> op.sacar(contas);
                case EXTRATO -> op.imprimirExtrato(contas);
                case GERENCIAR -> /*op.gerenciar(contas);*/ {}
                case SAIR -> {
                    sair = true;
                    continue;
                }
                default -> JOptionPane.showConfirmDialog(null, "Opção inválida", "Projeto Banco", JOptionPane.ERROR_MESSAGE);
            }
            
	    sair = !op.continuar();
	} while(!sair);
	
	System.out.println("PROGRAMA ENCERRADO!!!!");

    }
    
}
