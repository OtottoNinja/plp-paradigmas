
package aulaorientacaobjeto.ExercicioPessoa;
 import java.util.Scanner;
public class ExercicioPessoa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa novo = new Pessoa();
        novo.construtor();
        System.out.println("Nome: "+novo.nome);
    }
    
}
