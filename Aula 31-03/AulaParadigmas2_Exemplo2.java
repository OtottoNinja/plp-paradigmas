import java.util.Scanner;

public class AulaPLP2_Exemplo2 {
    public static void main(String[] args){
        float num1,num2;
        char calculo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        num1 = teclado.nextInt();
        System.out.println("Entre com o segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Escolha a operacao [ + ; - ; * ; / ]: ");
        calculo = teclado.next().charAt(0);
        
        switch(calculo){
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1+num2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1-num2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1*num2);
                break;
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1/num2);
                break;
        }
    }
    
}