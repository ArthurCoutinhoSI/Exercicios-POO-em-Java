/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programamidia;

/**
 *
 * @author Arthur Coutinho
 */
public class Musica extends Midia{
    private String album;
    private String produtora;
    private String produtor;
    private String compositores;

    public Musica(String album, String produtora, String produtor, String compositores, String artistas, String genero, int anoLancamento) {
        super(artistas, genero, anoLancamento);
        this.album = album;
        this.produtora = produtora;
        this.produtor = produtor;
        this.compositores = compositores;
    }

    @Override
    public String toString() {
        return "Musica:\n"
                + "" + "album: " + album + "\n"
                + "produtora: " + produtora + "\n"
                + "produtor: " + produtor + "\n"
                + "compositores: " + compositores;
    }
    
}
