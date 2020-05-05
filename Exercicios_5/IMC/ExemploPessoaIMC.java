/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_carro;

import java.util.Scanner;

public class ExemploPessoaIMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PessoaIMC pessoaIMC1 = new PessoaIMC();
        
        System.out.println("Me informe seu nome");
        pessoaIMC1.nome = teclado.nextLine();
        
        System.out.println("Me informe seu peso");
        pessoaIMC1.peso = teclado.nextFloat();
        
        System.out.println("Me informe sua altura");
        pessoaIMC1.altura = teclado.nextFloat();
        
        System.out.printf("Seu IMC é: %f\nVoce está classificado em: %s\n",pessoaIMC1.calcularIMC(),pessoaIMC1.classificarIMC());
        
    }
    
}
