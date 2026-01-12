/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author humberto.antonelli
 */
public class Operacao {
    
    public Menu selecionarOpcao() {
        String menu = "========= MENU ======== \n";
        for(Menu opcao : Menu.values()){
            menu += opcao.getCodigo() + " - " + opcao.getOperacao() + "\n";
        }
        menu += "\nDigite a opção desejada:";
        String opcaoSelecionada = JOptionPane.showInputDialog(menu);
  
        return Menu.findByCodigo(opcaoSelecionada);
    }
    
    public boolean criarContaBancaria(ArrayList<ContaBancaria> contas){
        String nome = JOptionPane.showInputDialog("Digite o nome do proprietário: ");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do proprietário: ");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do proprietário: ");
        String email = JOptionPane.showInputDialog("Digite o e-mail do proprietário: ");
        
        if(buscaConta(cpf, contas) != null){
            JOptionPane.showMessageDialog(null, "Não é possível realizar a operação, pois ainda não foi criada uma conta", "Projeto Banco", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            
        Proprietario proprietario = new Proprietario(nome, cpf, endereco, email);
        
        String tipo = JOptionPane.showInputDialog("Digite 1 para Conta Poupança\nDigite 2 para Conta Corrente");
        ContaBancaria conta = null;
        if(tipo.equals('2'))
            conta = new ContaCorrente(2000.0, 17.0, proprietario, 0.0, tipo);
        else
            conta = new ContaPoupanca(proprietario, 0.0, tipo);
        
        contas.add(conta);
        return true;
    }
    
    public void depositar(ArrayList<ContaBancaria> contas) {
        String cpf = JOptionPane.showInputDialog("Digite o CPF do proprietário: ");
        ContaBancaria conta = buscaConta(cpf, contas);
        if(conta == null){
            return;
        }
        
        String vlrTxt = JOptionPane.showInputDialog("Digite o valor a ser depositado: ");
        double valor = Double.parseDouble(vlrTxt);
        JOptionPane.showMessageDialog(null, 
                conta.depositar(valor)
                        ? "Depósito realizado com sucesso!"
                        : "Não foi possível realizar o depósito!");
    }
    
    public void sacar(ArrayList<ContaBancaria> contas) {
        String cpf = JOptionPane.showInputDialog("Digite o CPF do proprietário: ");
        ContaBancaria conta = buscaConta(cpf, contas);
        if(conta == null){
            return;
        }
        String vlrTxt = JOptionPane.showInputDialog("Digite o valor a ser sacado: ");
        double valor = Double.parseDouble(vlrTxt);
        
        boolean deuCerto;
        if(conta instanceof ContaCorrente){
            ContaCorrente aux = (ContaCorrente)conta;
            deuCerto = aux.sacar(valor);
        }else{
            ContaPoupanca aux = (ContaPoupanca)conta;
            deuCerto = aux.sacar(valor);
        }
            
         
        
        JOptionPane.showMessageDialog(null, 
                deuCerto
                        ? "Saque realizado com sucesso!"
                        : "Não foi possível realizar o saque!");
    }
    
    public void imprimirExtrato(ArrayList<ContaBancaria> contas) {
        String cpf = JOptionPane.showInputDialog("Digite o CPF do proprietário: ");
        ContaBancaria conta = buscaConta(cpf, contas);
        if(conta == null){
            return;
        }
        JOptionPane.showMessageDialog(null, conta.getExtrato());
    }
    
    public void gerenciar() {
        String[] opcoes = {"Habilitar", "Desabilitar"};
        int op = JOptionPane.showOptionDialog(null,
                "Gerenciar status das operações bancarias",
                "Projeto Banco",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        
        if(op == 0) {
            ContaBancaria.opHabilatada = true;
        }else {
            ContaBancaria.opHabilatada = false;
        }
    }
    
    public ContaBancaria buscaConta(String cpf, ArrayList<ContaBancaria> contas){
        ContaBancaria conta = null;
        for(ContaBancaria c : contas){
            if(cpf.equals(c.getProprietario().getCpf())){
                conta = c;
                break;
            }
        }
        
        if (conta == null) {
            return null;
        }
        return conta;
    }
    
    public boolean continuar() {
        int opcao = JOptionPane.showConfirmDialog(null, 
                "Deseja realizar uma nova operação?",
                "Projeto Banco",
                JOptionPane.YES_NO_OPTION);
        return opcao == JOptionPane.YES_OPTION;
    }
}
