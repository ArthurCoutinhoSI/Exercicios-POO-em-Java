/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectanglecountingwithstatic;

/**
 *
 * @author Arthur Coutinho
 */
public class Rectangle {
    private int hight;
    private int lenght;
    public static int countRectangleCreated;

    public Rectangle(int hight, int lenght) {
        this.hight = hight>1?hight:1;
        this.hight = lenght>1?lenght:1;
        countRectangleCreated++;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        if(hight > 0 && hight < 20)
            this.hight = hight;
        else
            System.err.println("Nao eh permitido alteracao de altura menor que zero ou maior que vinte");
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        if(lenght > 0 && lenght < 20)
            this.lenght = lenght;
        else
            System.err.println("Nao eh permitido alteracao de largura menor que zero ou maior que vinte");
    }

    @Override
    public String toString() {
        return "Rectangle{" + "hight=" + hight + ", lenght=" + lenght + '}';
    }
    
        
}
