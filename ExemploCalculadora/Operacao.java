package aulaorientacaobjeto.ExercicioCalculadora;


public class Operacao{
    int numero1;
    int numero2;
    
    //metodos
    
    public Operacao(){
    }
    
    public Operacao( int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public int soma(int numero1,int numero2){
        return(numero1 + numero2);
    }
    public int subtracao(int numero1, int numero2){
        return (numero1-numero2);
    }
    public int multiplicacao(int numero1, int numero2){
        return (numero1*numero2);
    }
    public int divisao(int numero1, int numero2){
        return (numero1/numero2);
    }
}


