/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaorientacaobjeto.exerciciocontacorrente;

/**
 *
 * @author igor hideaki martins naito
 */
public class ContaCorrente {
    int numeroConta;
    String nomeBanco;
    String nomeCliente;
    float saldo;
    
    //Metodos
    

    public ContaCorrente() {
    }

    public ContaCorrente(int numeroConta, String nomeBanco, String nomeCliente, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeBanco = nomeBanco;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    void definirSaldoInicial(float saldoInicial){
        saldo = saldoInicial;
    }
    
    public void depositar(float valor){
        if(valor > 0){
            saldo+=valor;
        }
    }
    
    public boolean sacar(float valor){
        if (saldo >= valor){
            saldo-=valor;
        }return true;
    }
    
    public void atualizaNomeCliente(String nCliente){
        this.nomeCliente=nCliente;
    }
    
    public void atualizaNomeBanco(String nBanco){
        this.nomeBanco=nBanco;
    }
    
    public void atualizaNumeroConta(int numConta){
        this.numeroConta=numConta;
    }

}
