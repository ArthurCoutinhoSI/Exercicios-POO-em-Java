/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaarmazenaconsultas;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class Consulta {
    private Pessoa paciente;
    private LocalDate data;
    private LocalTime hora;

    private Consulta(Pessoa paciente, LocalDate data, LocalTime hora) {
        this.paciente = paciente;
        this.data = data;
        this.hora = hora;
    }

    public static Consulta criarConsulta(){
        Pessoa paciente = Pessoa.criarPessoa();
        LocalDate data = solicitaData();
        LocalTime hora = LocalTime.parse(JOptionPane.showInputDialog("Informe a hora da consulta",
                "19:52"));
                
        return new Consulta(paciente, data, hora);
    }
    
    public static LocalDate solicitaData(){
        return LocalDate.parse(JOptionPane.showInputDialog("Informe a data da consulta",
                "2025-12-24"));
    }
    
    public static LocalTime solicitaHora(){
        return LocalTime.parse(JOptionPane.showInputDialog("Informe a hora da consulta",
                "19:52"));
    }

    public Pessoa getPaciente() {
        return paciente;
    }

    public void setPaciente(Pessoa paciente) {
        this.paciente = paciente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Consulta{" + "paciente=" + paciente + ", data=" + data + ", hora=" + hora + '}';
    }
    
}
