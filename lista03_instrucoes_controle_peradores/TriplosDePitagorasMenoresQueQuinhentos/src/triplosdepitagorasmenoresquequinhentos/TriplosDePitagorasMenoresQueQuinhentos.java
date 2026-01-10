/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package triplosdepitagorasmenoresquequinhentos;

/**
 *
 * @author Andressa
 */
public class TriplosDePitagorasMenoresQueQuinhentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hipotenusa, catetoAdjacente, catetoOposto;
        
        //vai ser feito no brute force;
        for(hipotenusa = 1; hipotenusa < 500; hipotenusa++){
            for(catetoAdjacente = 1; catetoAdjacente < 500; catetoAdjacente++){
                for(catetoOposto = 1; catetoOposto < 500; catetoOposto++){
                    if (verificaPitagoras(hipotenusa, catetoAdjacente, catetoOposto)) {
                        System.out.println("hipotenusa:\tcateto adjacente:\tcateto oposto:\n"
                                + hipotenusa + "\t\t\t"
                                + catetoAdjacente + "\t\t\t"
                                + catetoOposto + "\n");
                    }
                }
            }
        }
    }
    
    public static boolean verificaPitagoras(int hipotenusa, int catetoAdjacente, int catetoOposto){
        return (hipotenusa*hipotenusa)
                == (catetoAdjacente*catetoAdjacente)
                + (catetoOposto*catetoOposto)? true:false;
    }

}
