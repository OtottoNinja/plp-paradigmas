
package teste;

import Polimorfismo.Diretor;

public class testeSobrescrita {

    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        double salario= diretor.getSalario(200);
        System.out.println("O salario de diretor é: "+salario);
    }
    
}
