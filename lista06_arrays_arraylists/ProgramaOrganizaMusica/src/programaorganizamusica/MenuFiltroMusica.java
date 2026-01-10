/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package programaorganizamusica;

/**
 *
 * @author Andressa
 */
public enum MenuFiltroMusica {
    TITULO(1, "Título"), ARTISTA(2, "Artista"), GENERO(3, "Genero");
    
    private final int valorFiltro;
    private final String nome;

    private MenuFiltroMusica(int valorFiltro, String nome) {
        this.valorFiltro = valorFiltro;
        this.nome = nome;
    }

    public static MenuFiltroMusica getTITULO() {
        return TITULO;
    }

    public static MenuFiltroMusica getARTISTA() {
        return ARTISTA;
    }

    public static MenuFiltroMusica getGENERO() {
        return GENERO;
    }

    public int getValorFiltro() {
        return valorFiltro;
    }

    public String getNome() {
        return nome;
    }
    
    public static String toStringMenu(){
        String resp = "Escolha um dos atributos da musica para filtrar:\n";
        for (MenuFiltroMusica value : MenuFiltroMusica.values()) {
            resp += value.getValorFiltro() + "- ";
            resp += value.getNome() + "\n";
        }
        return resp;
    }  
}
