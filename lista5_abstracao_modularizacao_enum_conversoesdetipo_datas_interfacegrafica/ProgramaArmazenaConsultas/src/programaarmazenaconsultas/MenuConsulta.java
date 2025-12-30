/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package programaarmazenaconsultas;

/**
 *
 * @author Andressa
 */
public enum MenuConsulta {
    CRIAR_CONSULTA(1, "Criar Consulta"), ALTERAR_DADOS_PESSOAIS(2, "Alterar dados pessoais"), ALTERAR_DATA(3, "Alterar data"), ALTERAR_HORA(4, "Alterar hora"), SAIR(5, "Sair");
    
    private int valorMenuConsulta;
    private String nome;

    private MenuConsulta(int valorMenuConsulta, String nome) {
        this.valorMenuConsulta = valorMenuConsulta;
        this.nome = nome;
    }

    public int getValorMenuConsulta() {
        return valorMenuConsulta;
    }

    public String getNome() {
        return nome;
    }
    
    public static String toStringMenuConsulta(){
        String resp = "";
        
        for(MenuConsulta opcao : MenuConsulta.values()){
            resp += opcao.getValorMenuConsulta() + "- " +
                    opcao.getNome();
            resp += "\n";
        }
        
        return resp;
    }
    
}
