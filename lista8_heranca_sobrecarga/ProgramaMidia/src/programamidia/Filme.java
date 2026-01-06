/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programamidia;

/**
 *
 * @author Arthur Coutinho
 */
public class Filme extends Midia{
    private String estudio;
    private String direcao;

    public Filme(String estudio, String direcao, String artistas, String genero, int anoLancamento) {
        super(artistas, genero, anoLancamento);
        this.estudio = estudio;
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "Filme:\n"
                + "estudio: " + estudio + "\n"
                + "direcao: " + direcao;
    }

}
