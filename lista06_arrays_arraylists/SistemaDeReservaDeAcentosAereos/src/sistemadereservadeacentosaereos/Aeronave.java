/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadereservadeacentosaereos;

/**
 *
 * @author Andressa
 */
public class Aeronave {
    private String modelo;
    private int fileiras;
    private int numeroDeAcentos;

    public Aeronave(String modelo, int fileiras, int numeroDeAcentos) {
        this.modelo = modelo;
        this.fileiras = fileiras;
        this.numeroDeAcentos = numeroDeAcentos;
    }
    
    public static void cadastraAeronavesPredefinidas(Aeronave[] aeronaves){
        aeronaves[0] = new Aeronave("tecoteco", 2, 7);
        aeronaves[1] = new Aeronave("atr72", 4, 15);
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFileiras() {
        return fileiras;
    }

    public void setFileiras(int fileiras) {
        this.fileiras = fileiras;
    }

    public int getNumeroDeAcentos() {
        return numeroDeAcentos;
    }

    public void setNumeroDeAcentos(int numeroDeAcentos) {
        this.numeroDeAcentos = numeroDeAcentos;
    }

    @Override
    public String toString() {
        return "Aeronave{" + "modelo=" + modelo + ", fileiras=" + fileiras + ", numeroDeAcentos=" + numeroDeAcentos + '}';
    }
    
}
