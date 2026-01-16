/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaalunos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Aluno {
    private String nome;
    private double[] notas = new double[3];
    private double media = 0;
    private static double mediaGeral = 0;

    public Aluno() {
    }
    
//    factory pede nome e notas do aluno
    public boolean solicitaNomeENotasDoAluno(){
        String s = JOptionPane.showInputDialog("Informe o nome nome do aluno ", "Arthur");
        setNome(s);
        alteraNotas();
        alteraMedia();
        
        return true;
    }
    
    public boolean alteraNotas(){
        for (int i = 0; i < notas.length; i++) {
            String s = JOptionPane.showInputDialog("Informe uma nota para o aluno ", "6.0");
            double nota = Double.parseDouble(s);
            notas[i] = nota;
        }
        
        return true;
    }
    
    public boolean alteraMedia(){
        for (double nota : notas) {
            this.media += nota;
        }
        this.media /= notas.length;
        
        return true;
    }

    public double[] getNotas() {
        return notas;
    }

    public double getMedia() {
        return media;
    }

    public static double getMediaGeral() {
        return mediaGeral;
    }

    public static void setMediaGeral(double mediaGeral) {
        Aluno.mediaGeral = mediaGeral;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", notas=" + Arrays.toString(notas) + ", media=" + media + '}';
    }
    
}
