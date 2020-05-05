import java.util.Scanner;

public class AulaPLP2_Exemplo6 {
    public static void main(String[] args){
        int x[] = new int[10];
        x[9] = 8;
        System.out.println("O vetor x na indice 9 e : " + x[9]);
        for (int i=0; i < x.length; i++){
            x[i] = i * 3;
        }
        
        for (int i=0; i < x.length; i++){
            System.out.println("O valor da indice do vetor x e: " + i + " e seu conteudo e: " + x[i]);
        }
    }
}