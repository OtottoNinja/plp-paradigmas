/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author igor hideaki martins naito
 */
public class DispenserNota100 implements IDispenserCaixaEletronico{
    private IDispenserCaixaEletronico proximoDispenser;
    @Override
    public void setProximoElo(IDispenserCaixaEletronico proximoElo) {
        this.proximoDispenser=proximoElo;
    }

    @Override
    public void sacar(SaqueDinheiro saque) {
        if(saque.getValor()>=100){
            int notas = saque.getValor()/100;
            int restante = saque.getValor()%100;
            System.out.println("Liberado "+notas+" de 100 reais");
            if(restante != 0){
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
            }
        }else{
            this.proximoDispenser.sacar(saque);
        }
    }
    
}
