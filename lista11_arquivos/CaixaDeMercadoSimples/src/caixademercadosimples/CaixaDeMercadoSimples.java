/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixademercadosimples;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class CaixaDeMercadoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 8: []
//Faça um sistema para um caixa de mercado (simples obviamente). Inicialmente o sistema deve apresentar um
//menu para o usuário selecionar uma opção. O menu deve apresentar as seguintes opções:
//1 - Cadastrar compra
//2 - Total de vendas do mês
//3 - Sair
//Se o usuário selecionar a opção 1, o sistema irá pedir para o usuário digitar a descrição de um produto, a quantidade
//de itens comprados do produto e o valor unitário do produto. Após inserir essas informações, o sistema deve
//perguntar se o caixa quer inserir a compra de outro produto. Se o usuário selecionar SIM, as mesmas informações
//apresentadas anteriormente devem ser inseridas para o outro produto. Ao selecionar a opção NÃO, o sistema deve
//exibir o valor total da compra e deverá ser gravado um arquivo texto (em um diretório especificado no código por
//você), contendo a descrição, a quantidade e o valor de cada item vendido. O nome do arquivo deve ser composto
//pela data e pela hora da compra.
//Se o usuário selecionar a opção 2, deve-se pedir para o usuário informar um mês e um ano. Deve-se então percorrer
//o diretório, abrir todos os arquivos que contém o mês e ano especificados pelo caixa e obter o valor total das compras
//de cada arquivo. No final, o sistema deverá apresentar o valor total das compras do mês informado pelo caixa.
//Esse valor deverá ser exibido na tela. Utilizar objetos para gravação e leitura de textos sequenciais.
        
        Operacao op = new Operacao();
        ArrayList<Compra> compras = new ArrayList<Compra>();
        boolean sair = false;
        
        do {
            
            
            
            Menu escolha = op.selecionaOpcao();
            if (escolha == null) {
                JOptionPane.showConfirmDialog(null, "Opção Inválida!", "Projeto Caixa Simples", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            switch (escolha) {
                case CADASTRAR -> op.cadastrarCompra(compras);
                case TOTAL_VENDAS -> op.valorTotalDeVendasNoMes(compras);
                case SAIR -> {
                    sair = true;
                }
            }
        } while (!sair);
        
        JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO!");
        
    }
    
}
