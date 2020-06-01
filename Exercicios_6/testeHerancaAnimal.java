/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteHeranca;

import herancas.Cachorro;
import herancas.Gato;

/**
 *
 * @author igor hideaki martins naito
 */
public class testeHerancaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        cachorro.setNome("Luna");
        cachorro.setRaca("Boxer");
        gato.setNome("Gnar");
        
        System.out.println("O cachorro "+cachorro.getNome()
                           +" da raça "+cachorro.getRaca()
                           +" faz "+cachorro.late());
    }
    
}