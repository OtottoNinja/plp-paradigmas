import java.util.Scanner;

public class AulaPLP2_Exemplo1 {
    public static void main(String[] args){
        int num;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = leitura.nextInt();
        
        if (num>0){
            System.out.println("O numero e positivo.");       
        }else{
            System.out.println("O numero e negativo.");
        }
    }
    
}