/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animaisnamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class AnimaisNaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 5: [];
//Crie uma classe Animal. Essa classe deve conter um único método abstrato que se chama barulho(). Crie
//uma classe Cachorro, uma classe Galinha e uma classe Gato, e implemente o método barulho() nessas
//classes. Crie uma outra classe que contenha o método main e crie um array bidimensional do tipo Animal de
//tamanho 5x5. Peça para o usuário informar a linha a coluna e o tipo de Animal, e insira esse animal na posição
//correspondente da matriz. Peça para o usuário inserir 4 animais. Após isso, percorra o array e imprima o barulho
//dos animais na tela de acordo com as posições desses animais no array.
        
        Animal[][] campoDeAnimais = new Animal[5][5];
        
        for (int i = 0; i < 4; i++) {
            coloqueAnimalNoCampo(campoDeAnimais);
        }
        mostraMatriz(campoDeAnimais);
    }
    
    public static void coloqueAnimalNoCampo(Animal[][] campoDeAnimais){
        String linha = JOptionPane.showInputDialog("Informe a linha aonde o animal se encontra (maior que zero e menor que 5)");
        String coluna = JOptionPane.showInputDialog("Informe a coluna aonde o animal se encontra (maior que zero e menor que 5)");
        String tipoAnimal = JOptionPane.showInputDialog("Informe o tipo de animal que se encontra nessas coordenadas:\n"
                + "1- Cachorro\n"
                + "2- Galinha\n"
                + "3- Gato", "2");
        int linhaInt = Integer.parseInt(linha) -1;
        int colunaInt = Integer.parseInt(coluna) -1;
        int tipoAnimalInt = Integer.parseInt(tipoAnimal);
        
        if(tipoAnimalInt == 1){
            campoDeAnimais[linhaInt][colunaInt] = new Cachorro();
        }
        if(tipoAnimalInt == 2){
            campoDeAnimais[linhaInt][colunaInt] = new Galinha();
        }
        if(tipoAnimalInt == 3){
            campoDeAnimais[linhaInt][colunaInt] = new Gato();
        }
    }
    
    public static void mostraMatriz(Animal[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            Animal[] animals = matriz[i];
            for (int j = 0; j < animals.length; j++) {
                Animal animal = animals[j];
                if(animal != null)
                    animal.barulho();
            }
        }
    }
}
