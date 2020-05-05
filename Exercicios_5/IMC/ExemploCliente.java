/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_carro;

/**
 *
 * @author igor hideaki martins naito
 */
public class ExemploCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente pessoa = new Cliente(444444444,"4342432","joao", "43241324");
        Cliente pessoa2 = new Cliente(555555, "31231231");
        System.out.println(pessoa2.idCliente);
    }
    
}
