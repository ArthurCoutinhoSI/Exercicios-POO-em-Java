/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programaalunos;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        nos testes a media geral da turma ficou como zero.
//        mostrou o endereço das notas ao invés das notas
        
        Aluno[] alunos = new Aluno[5];
        
        for (int i = 0; i < alunos.length; i++) {
            
            alunos[i] = new Aluno();
            alunos[i].solicitaNomeENotasDoAluno();
            
        }
        Aluno.setMediaGeral(calculaMediaGeral(alunos));
        
        mostraListaDeAlunos(alunos);
        
    }
    
    public static double calculaMediaGeral(Aluno[] alunos){
        double mediaGeral = 0;
        
        for (Aluno aluno : alunos) {
            mediaGeral += aluno.getMedia();
        }
        mediaGeral /= alunos.length;
        
        return mediaGeral;
    }
    
    public static void mostraListaDeAlunos(Aluno[] alunos){
        String resp = "";
        for (Aluno aluno : alunos) {
            resp += aluno.toString();
            resp += "\n";
        }
        resp += "Media Geral da turma: " + Aluno.getMediaGeral();
        JOptionPane.showMessageDialog(null, resp);
    }

}
