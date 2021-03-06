
package Interface;

public class DispenserNota20 implements IDispenserCaixaEletronico{
    private IDispenserCaixaEletronico proximoDispenser;

    @Override
    public void setProximoElo(IDispenserCaixaEletronico proximoElo) {
        this.proximoDispenser = proximoElo;
    }

    @Override
    public void sacar(SaqueDinheiro saque) {
        if(saque.getValor()>=20){
            int notas = saque.getValor()/20;
            int restante = saque.getValor()%20;
            System.out.println("Liberado "+notas+" de 20 reais");
            if(restante != 0){
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
            }
        }else{
            this.proximoDispenser.sacar(saque);
        }
    }
    

    
}
