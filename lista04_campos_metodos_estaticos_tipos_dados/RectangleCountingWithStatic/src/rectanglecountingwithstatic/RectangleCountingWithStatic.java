/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package rectanglecountingwithstatic;

/**
 *
 * @author Arthur Coutinho
 */
public class RectangleCountingWithStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectangle1 = new Rectangle(0, 0);
        Rectangle rectangle2 = new Rectangle(5, 10);
        
        System.out.println("Total of rectangles: "
                + Rectangle.countRectangleCreated + "\n"
                + "Existing rectangles: \n"
                + rectangle1.toString() + "\n"
                + rectangle2.toString());
    }

}
