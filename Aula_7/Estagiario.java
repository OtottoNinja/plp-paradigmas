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
public class Estagiario extends Funcionario{
    private int x=10;
    @Override
    public double getSalario(int horas){
        return horas*50;
    }
    public int total(){
        return this.x + super.x;
    }
    
}
