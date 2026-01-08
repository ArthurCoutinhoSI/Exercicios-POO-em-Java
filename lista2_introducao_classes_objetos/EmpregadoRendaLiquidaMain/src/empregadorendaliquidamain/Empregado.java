/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregadorendaliquidamain;

/**
 *
 * @author Andressa
 */
public class Empregado {
    private String nome;
    private double salarioBruto;

    public Empregado(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }
    
    private double calculaIR(){
        double salarioBruto = getSalarioBruto();
        double impostoDeRenda = 0;
        
        if (salarioBruto <= 1903.98) {
            impostoDeRenda = 0;
            return impostoDeRenda;
        }
        if (salarioBruto <= 2826.65) {
            impostoDeRenda = 0.075;
            return impostoDeRenda;
        }
        if (salarioBruto <= 3751.05) {
            impostoDeRenda = 0.15;
            return impostoDeRenda;
        }
        if (salarioBruto <= 4664.68) {
            impostoDeRenda = 0.225;
            return impostoDeRenda;
        }
        if (salarioBruto >= 4664.69) {
            impostoDeRenda = 0.275;
            return impostoDeRenda;
        }
        return impostoDeRenda;
    }

    public double rendaLiquidaAnual(){
        double rendaLiquida;
        double rendaAnual;
        rendaLiquida = getSalarioBruto() - calculaIR();
        rendaAnual = rendaLiquida * 12;
        return rendaAnual;
    }
    
    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", salarioBruto=" + salarioBruto + '}';
    }       
}
