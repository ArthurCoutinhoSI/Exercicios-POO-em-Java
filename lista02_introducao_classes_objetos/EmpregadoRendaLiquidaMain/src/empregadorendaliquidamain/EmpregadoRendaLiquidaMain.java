/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package empregadorendaliquidamain;

/**
 *
 * @author Arthur Coutinho
 */
public class EmpregadoRendaLiquidaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado empregado = LeInformacoesDoEmpregado.leAtributosDoUsuario();
        
        System.out.println(empregado.toString());
        System.out.println("Renda Anual:"
                + empregado.rendaLiquidaAnual());
    }

}
