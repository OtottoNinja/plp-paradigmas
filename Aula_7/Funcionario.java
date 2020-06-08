/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author igor hideaki martins naito
 */
public class Funcionario {
    private String nome;
    private double salario;
    public int x;

    public double getSalario(int horas) {
        return horas*100;
    }
    public int soma(int x, int y){
        return (x+y);
    }
    public int soma(int x, int y, int z){
        return(x+y+z);
    }
    
    
}
