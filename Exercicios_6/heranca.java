/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteHeranca;

import herancas.Motorista;

public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motorista objetomotorista = new Motorista("Jose", "11111666666", "6666666666");
        objetomotorista.setNome("Roberto");
        objetomotorista.setCpf("22222222222");
        
        System.out.println("Nome: "+objetomotorista.getNome()+" CPF: "+objetomotorista.getCpf());
    }
    
}

