/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package sistemadereservadeacentosaereos;

import java.time.LocalTime;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class SistemaDeReservaDeAcentosAereos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 9: []
//O objetivo desse exercício é fazer um sistema de reserva de assentos para voos de uma companhia aérea. Para isso,
//primeiro crie uma classe Aeronave, contendo os campos modelo (String), número de fileiras (int), e número
//de assento por fileiras (int). Faça com que todos os campos tenham acesso do tipo private e providencie um
//construtor que tenha como argumentos os campos da classe Aeronave. Depois, crie uma classe Voo, a qual tem
//como campos origem (String), chegada (String) e hora de partida (LocalTime) e assentos disponíveis (uma
//matriz de boolean cujas dimensões irão corresponder ao número de fileiras X número de assento nas fileiras). Crie
//um vetor de Voo e defina você mesmo os voos com suas respectivas aeronaves. A partir daí, peça para um usuário
//definir uma cidade de origem, uma cidade de destino, um horário de partida e um assento (especificando a fileira
//e o assento na fileira). Verifique se existe um voo com as especificações do usuário (percorrendo o vetor de voos)
//e verifique se a poltrona escolhida pelo usuário está disponível. Se sim, exiba a mensagem “Acento reservado com
//sucesso” juntamente com as informações do voo e da aeronave. Certifique de tornar o acento escolhido pelo usuário
//indisponível para a escolha de um outro usuário. Ao final de cada reserva exiba todos os assentos disponíveis no
//voo.
        
        Voo[] voosDisponiveis = new Voo[5];
        Aeronave[] aeronavesDisponiveis = new Aeronave[2];
        
        Aeronave.cadastraAeronavesPredefinidas(aeronavesDisponiveis);
        Voo.cadastraVoosPredefinidos(voosDisponiveis, aeronavesDisponiveis);
//        JOptionPane.showMessageDialog(null, voosDisponiveis[1].getLocalDeDestino()+ "OPA! \n");
        
        Voo reservado = solicitaDadosDoVoo(voosDisponiveis);
        reservado.mostraVoo();
        reservado.mostraAeronaveResponsavel(aeronavesDisponiveis);
        reservado.mostraAcentosDoVoo();
    }
    
    public static Voo solicitaDadosDoVoo(Voo[] voos){
        String origem;
        String destino;
        String horariotxt;
        LocalTime horario;
        int fileira;
        int acentoNaFileira;
        
        origem = JOptionPane.showInputDialog("Informe uma origem pra sua viagem", "Mirandópolis");
        destino = JOptionPane.showInputDialog("Informe um destino pra sua viagem", "Três Lagoas");
        
        horariotxt = JOptionPane.showInputDialog("Informe um horario pra sua viagem", "14:00");
        horario = LocalTime.parse(horariotxt);
        
        fileira = Integer.parseInt(
                JOptionPane.showInputDialog("Informe uma fileira para o acento pra sua viagem", "1"));
        acentoNaFileira = Integer.parseInt(
                JOptionPane.showInputDialog("Informe um acento na fileira escolhida pra sua viagem", "5"));
        
        Voo reservado = reservaAcentoSeVooExisteEAcentoDisponivel( origem, destino, horario, fileira,
                acentoNaFileira, voos);
        
        return reservado;
    }
    
    public static Voo reservaAcentoSeVooExisteEAcentoDisponivel(String origem, String destino, LocalTime horario,
            int fileira, int acentoNaFileira, Voo[] voos){
        
        for (Voo voo : voos) {
            boolean deuCerto = true;
//            JOptionPane.showMessageDialog(null, "Origem: " + voo.getLocalDeOrigem()+ "\n"
//                    + "Destino: " + voo.getLocalDeDestino());
            if (!voo.getLocalDeOrigem().equals(origem)) {
                deuCerto = false;
            }
            if (!voo.getLocalDeDestino().equals(destino)) {
                deuCerto = false;
            }
            if (!voo.getHoraDaPartida().equals(horario)) {
                deuCerto = false;
            }
            if (voo.getAcentosDisponiveis()[fileira][acentoNaFileira] != false) {
                JOptionPane.showMessageDialog(null, "passou aqui: \n"
                        + voo.getAcentosDisponiveis()[fileira][acentoNaFileira]);
                deuCerto = false;
            }
            if (deuCerto) {
                voo.setAcentosDisponíveis(fileira, acentoNaFileira);
                JOptionPane.showMessageDialog(null, "Acento reservado com sucesso!!");
                
//                
                
                return voo;
            }
        }
        JOptionPane.showMessageDialog(null, "Nenhum acento disponível com essas especificações");
        return null;
    }

    
}
