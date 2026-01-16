/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixademercadosimples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Operacao {
    private String caminhoRelativo;
    
    public Operacao() {
    }
    
    public Menu selecionaOpcao(){
        String resp = "";
        for (Menu op : Menu.values()) {
            resp += op.getNumeroDaOpcao() + " - ";
            resp += op.getNomeDaOpcao() + "\n";
        }
        
        return Menu.findByCodigo(JOptionPane.showInputDialog(null, resp, "Escolha uma das opções", JOptionPane.QUESTION_MESSAGE));
    }
    
    public void cadastrarCompra(ArrayList<Compra> compras){
        Compra compra = Compra.criaCompra();
        compras.add(compra);
        JOptionPane.showMessageDialog(null, "Compra inserida com sucesso!", "Cadastrar Compra", JOptionPane.INFORMATION_MESSAGE);
        
        perguntaSeQuerInserirMaisCompra(compras);
    }
    
    private void perguntaSeQuerInserirMaisCompra(ArrayList<Compra> compras){
        int desejaContinuar = JOptionPane.showConfirmDialog(null, "Deseja inserir mais uma compra?", "Cadastrar Compra", JOptionPane.YES_NO_OPTION);
        if (desejaContinuar == JOptionPane.YES_OPTION) {
            cadastrarCompra(compras);//recursao
        }else{
            JOptionPane.showMessageDialog(null, "R$ "
                    + calculaValorTotalDaCompra(compras), "Valor Total da compra", JOptionPane.INFORMATION_MESSAGE);
            registraComprasNoArquivo(compras);
        }
    }

    public void setCaminhoRelativo() {
        caminhoRelativo = "output";
        
        if (!Files.exists(Path.of(caminhoRelativo), LinkOption.NOFOLLOW_LINKS)) {
            File file = new File(caminhoRelativo);
            file.mkdir();
        }
    }
    
    private void registraComprasNoArquivo(ArrayList<Compra> compras){
        setCaminhoRelativo();
        
        caminhoRelativo += "\\";
        caminhoRelativo += LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"))
                + ".txt";
        
        try (ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(caminhoRelativo))){
            arquivo.writeObject(compras);            
        } catch (IOException ioe) {
            
            ioe.printStackTrace();
        }
        compras.clear();
    }
    
    public void valorTotalDeVendasNoMes(ArrayList<Compra> compras){
        double soma = 0;
        String dataString = JOptionPane.showInputDialog(null, ""
                + "Informe o ano e o mês desejado para obter o valor total de vendas no formato yyyy-MM", "Valor Total de Vendas", JOptionPane.QUESTION_MESSAGE);
        
        if (dataString == null || dataString.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data não informada!");
            return;
        }

        dataString = dataString.trim();
        dataString = dataString.replace(".", "-").replace("/", "-");
        
        ArrayList<File> files = buscaNomeNoDiretorio(dataString);
        
        for (File file : files) {
            
            try (ObjectInputStream arquivo = new ObjectInputStream(new FileInputStream(file))){
                
                try {
                    soma += calculaValorTotalDaCompra((ArrayList<Compra>) arquivo.readObject());
                } catch (ClassNotFoundException cnfe) {
                    cnfe.printStackTrace();
                }
                
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valor total arrecadado no período "
                + dataString
                + " foi de: " + soma + " reais!");
    }
    
    private ArrayList<File> buscaNomeNoDiretorio(String nomeFile){
        ArrayList<File> files = new ArrayList<File>();
        
        setCaminhoRelativo();
        
        File diretorio = new File(caminhoRelativo);
        
        for (File file : diretorio.listFiles()) {
            if (file.getName().startsWith(nomeFile)) {
                files.add(file);
            }
        }
        
        return files;
    }
    
    private double calculaValorTotalDaCompra(ArrayList<Compra> compras){
        double soma = 0;
        
        for (Compra compra : compras) {
            soma += compra.getValorTotal();
        }
        
        return soma;
    }
}
