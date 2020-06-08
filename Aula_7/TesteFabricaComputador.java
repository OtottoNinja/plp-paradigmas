/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Polimorfismo.Computador;
import Polimorfismo.ComputadorFactory;

/**
 *
 * @author igor hideaki martins naito
 */
public class TesteFabricaComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador pc =  ComputadorFactory.getComputador("Computador Pessoal","16GB","1TB","3.4Ghz");
        Computador server =  ComputadorFactory.getComputador("Servidor","128GB","3TB","5.4Ghz");
        
        System.out.println("Fabrica computador pessoal: "+pc);
        System.out.println("Fabrica servidor: "+server);
    }
    
}
