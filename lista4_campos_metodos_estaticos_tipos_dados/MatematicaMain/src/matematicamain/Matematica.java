/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematicamain;

/**
 *
 * @author Andressa
 */
public class Matematica {
    
    public static double multiplica(double a, double b){
        return a * b;
    }
    public static double eleva(double a, int b){
        double elevado = 1;
        for (int i = 0; i < b; i++) {
            elevado *= a;
        }
        return elevado;
    }
    public static double soma(double a, double b){
        return  a + b;
    }
    public static double maximo(double a, double b){
        return a >= b? a:b;
    }
    public static double minimo(double a, double b){
        return a < b? a:b;
    }
}
