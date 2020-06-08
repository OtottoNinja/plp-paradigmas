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
public class ComputadorFactory {

    public static Computador getComputador(String type, String ram, String hdd, String cpu) {
        if ("Computador Pessoal".equalsIgnoreCase(type)) {
            return new ComputadorPessoal(ram, hdd, cpu);
        } else if ("Servidor".equalsIgnoreCase(type)) {
            return new Servidor(ram, hdd, cpu);
        }
        return null;
    }
}
