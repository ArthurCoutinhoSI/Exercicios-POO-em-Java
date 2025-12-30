/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package programaorganizamusica;

/**
 *
 * @author Andressa
 */
public enum MenuMusica {
    
    CADASTRAR_MUSICA(1,"Cadastrar musica"), LISTAR_TODAS_MUSICAS(2, "Listar todas as musicas"), PROCURAR_MUSICAS(3 ,"Procurar musicas"), REMOVER_MUSICAS(4, "Remover musicas"), SAIR(5, "Sair");
    
    private final int valorMenu;
    private final String nome;

    private MenuMusica(int valorMenu, String nome) {
        this.valorMenu = valorMenu;
        this.nome = nome;
    }

    public static MenuMusica getCADASTRAR_MUSICA() {
        return CADASTRAR_MUSICA;
    }

    public static MenuMusica getLISTAR_TODAS_MUSICAS() {
        return LISTAR_TODAS_MUSICAS;
    }

    public static MenuMusica getPROCURAR_MUSICAS() {
        return PROCURAR_MUSICAS;
    }

    public static MenuMusica getREMOVER_MUSICAS() {
        return REMOVER_MUSICAS;
    }

    public static MenuMusica getSAIR() {
        return SAIR;
    }

    public int getValorMenu() {
        return valorMenu;
    }

    public String getNome() {
        return nome;
    }
    
    public static String toStringMenu(){
        String resp = "";
        for (MenuMusica value : MenuMusica.values()) {
            resp += value.getValorMenu() + "- ";
            resp += value.getNome() + "\n";
        }
        return resp;
    }    
}
