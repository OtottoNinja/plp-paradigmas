import java.util.Scanner;

public class AulaPLP_Exemplo3 {
    public static void main(String[] args) {
        int x, y, soma;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        x = s.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = s.nextInt();
        soma = x+y;
        if (soma>10){
            System.out.printf("\nA soma dos dois numeros e maior que 10.\nA soma entre eles e %d", (soma));
        }else{
            System.out.printf("\nA soma e menor ou igual a 10.\nA soma entre eles e %d", (soma));
        }
    }
}