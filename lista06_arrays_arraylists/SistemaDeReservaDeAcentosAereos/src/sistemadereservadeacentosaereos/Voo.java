/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadereservadeacentosaereos;

import java.time.LocalTime;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Voo {
    private String localDeOrigem;
    private String localDeDestino;
    private LocalTime horaDaPartida;
    private boolean[][] acentosDisponiveis;

    public Voo(String localDeOrigem, String localDeDestino, LocalTime horaDaPartida, boolean[][] acentosDisponíveis) {
        this.localDeOrigem = localDeOrigem;
        this.localDeDestino = localDeDestino;
        this.horaDaPartida = horaDaPartida;
        this.acentosDisponiveis = acentosDisponíveis;
    }
    
    public static void cadastraVoosPredefinidos(Voo[] voosDiponiveis, Aeronave[] aeronaves){
        voosDiponiveis[0] = cadastraVoo(aeronaves[1], "Três Lagoas", "Três Passos - RS" , "07:00");
        voosDiponiveis[1] = cadastraVoo(aeronaves[0], "Três Lagoas", "Mirandópolis" , "10:00");
        voosDiponiveis[2] = cadastraVoo(aeronaves[0], "Mirandópolis", "Três Lagoas" , "14:00");
        voosDiponiveis[3] = cadastraVoo(aeronaves[0], "Três Lagoas", "Araçatuba" , "20:00"); 
        voosDiponiveis[4] = cadastraVoo(aeronaves[1], "Três Passos - RS", "Três Lagoas" , "07:00");
        
//        JOptionPane.showMessageDialog(null, voosDiponiveis[1].toString());
    }       
    
    public static Voo cadastraVoo(Aeronave aeronaveResponsavelPeloVoo, String origem,String destino,
            String horas){
        
        int numeroDeFileiras = aeronaveResponsavelPeloVoo.getFileiras();
        int numeroDeAcentosPorFileira = aeronaveResponsavelPeloVoo.getNumeroDeAcentos();
        boolean[][] acentosDisponíveis = new boolean[numeroDeFileiras][numeroDeAcentosPorFileira];
        LocalTime hora = LocalTime.parse(horas);
                
        Voo voo = new Voo(origem, destino, hora, acentosDisponíveis);
        return voo;
    }
    
    public void mostraAeronaveResponsavel(Aeronave[] aeronaves){
//        aqui chegamos ao final do exercicio, preciso mostrar informacoes do voo e da aeronave
//        pooorem... nao existe modelo da aeronave dentro da classe voo, eu poderia facilmente ter
//        uma classe dessa ou um identificador, mas vou ter q refatorar todos os construtores e 
//        fabricas, acho q nao vale apena, vou apenas colocar um if no laço rodando nas aeronaves
//        e ta feito

        for (Aeronave aeronave : aeronaves) {
            if (aeronave.getFileiras() == this.getAcentosDisponiveis().length) {
                JOptionPane.showMessageDialog(null, "Modelo da aeronave responsável pelo voo selecionado: \n"
                + aeronave.toString());
            }
        }
    }
    
    public void mostraVoo(){
        JOptionPane.showMessageDialog(null, "Voo selecionado: "
                + this.toString());
    }
    
    public void mostraAcentosDoVoo(){
        String resp = "";
        for (boolean[] acentosDisponivei : acentosDisponiveis) {
            resp += Arrays.toString(acentosDisponivei) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Acentos disponíveis no voo selecionado: \n"
                    + resp);
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }

    public String getLocalDeDestino() {
        return localDeDestino;
    }

    public LocalTime getHoraDaPartida() {
        return horaDaPartida;
    }

    public boolean[][] getAcentosDisponiveis() {
        return acentosDisponiveis;
    }

    public void setAcentosDisponíveis(int fileira, int acentoNaFileira) {
        this.acentosDisponiveis[fileira][acentoNaFileira] = true;
    }

    @Override
    public String toString() {
        return "Voo{" + "localDeOrigem=" + localDeOrigem + ", localDeDestino=" + localDeDestino + ", horaDaPartida=" + horaDaPartida + '}';
    }
    
}
