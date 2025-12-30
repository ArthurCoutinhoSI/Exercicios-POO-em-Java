/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package largestnumber;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 1, number, largest = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("informe o "+ counter +"ario numero");
            number = scanner.nextInt();
            if(largest < number){
                largest = number;
            }
            System.out.println(counter + "\n"
                    + number + "\n"
                    + largest + "\n");
            counter++;
        } while (counter <= 10);
    }

}
