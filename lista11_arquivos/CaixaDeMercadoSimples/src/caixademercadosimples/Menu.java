/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package caixademercadosimples;

/**
 *
 * @author Arthur Coutinho
 */
public enum Menu {
    CADASTRAR(1, "Cadastrar Compra"), TOTAL_VENDAS(2, "Total De Vendas do mês"), SAIR(3, "Sair");
    
    private final int numeroDaOpcao;
    private final String nomeDaOpcao;

    private Menu(int numeroDaOpcao, String nomeDaOpcao) {
        this.numeroDaOpcao = numeroDaOpcao;
        this.nomeDaOpcao = nomeDaOpcao;
    }

    public static Menu getCADASTRAR() {
        return CADASTRAR;
    }

    public static Menu getTOTAL_VENDAS() {
        return TOTAL_VENDAS;
    }

    public static Menu getSAIR() {
        return SAIR;
    }

    public int getNumeroDaOpcao() {
        return numeroDaOpcao;
    }

    public String getNomeDaOpcao() {
        return nomeDaOpcao;
    }
    
    public static Menu findByCodigo(String codigo){
        for (Menu value : values()) {
            if (codigo.equals(value.getNumeroDaOpcao() + "")) {
                return value;
            }
        }
        return null;
    }
}
