import java.util.Scanner;

public class AulaPLP2_Exemplo3 {
    public static void main(String[] args){
        int num1,num2;
        int maior;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num1 = leitura.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = leitura.nextInt();
        /*
        if (num1 > num2){
            maior = num1;
        }else {
            maior = num2;
        }*/
        maior = (num1 > num2) ? num1 : num2;
        System.out.println("O maior numero e: " + maior);
    }
    
}