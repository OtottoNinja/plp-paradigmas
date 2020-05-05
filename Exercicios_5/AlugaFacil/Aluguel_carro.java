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
public class Aluguel_carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        cliente1.idCliente = 1;
        cliente1.nome = "igor";
        cliente1.cpf = "00011111111";
        cliente1.cnh = "1110000000";
        
        cliente2.idCliente = 2;
        cliente2.nome = "joao p";
        cliente2.cpf = "33333222222";
        cliente2.cnh = "22222666666";
        
        carro1.idCarro = 1;
        carro1.placa = "aaa-1234";
        carro1.fabricante = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2019;
        carro1.cor = "prata";
        carro1.valorDiaria = (float) 250.32;
        
        carro2.idCarro = 2;
        carro2.placa = "kkk-2469";
        carro2.fabricante = "Hyundai";
        carro2.modelo = "HB20";
        carro2.ano = 2019;
        carro2.cor = "cinza fosco";
        carro2.valorDiaria = 300;
        
        System.out.println("O nome do primeiro cliente é "+cliente1.nome+" e ele quer alugar o carro "+carro1.modelo+" de placa "+carro1.placa);
        System.out.println("O nome do segundo cliente é "+cliente2.nome+" e ele quer alugar o carro "+carro2.modelo+" de placa "+carro2.placa);
    }
    
}
