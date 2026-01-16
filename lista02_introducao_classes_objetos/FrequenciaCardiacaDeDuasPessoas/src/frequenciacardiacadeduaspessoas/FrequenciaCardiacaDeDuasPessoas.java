/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package frequenciacardiacadeduaspessoas;

/**
 *
 * @author Arthur Coutinho
 */
public class FrequenciaCardiacaDeDuasPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.recebeInformacoesDaPessoa();
        pessoa2.recebeInformacoesDaPessoa();
        
        pessoa1.veridicaSeFrequenciaEstaElevada();
        pessoa2.veridicaSeFrequenciaEstaElevada();
        
        //mostra dados da pessoa
        pessoa1.toString();
        pessoa2.toString();
        
        Pessoa.mostraPessoaComMaiorFrequencia(pessoa1, pessoa2);
    }

}
