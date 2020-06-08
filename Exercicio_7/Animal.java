package exerc;

/**
 *
 * @author igor hideaki martins naito
 */
public abstract class Animal {
    protected String nome;
    protected int numeroPatas;

    
    public Animal(String nome) {
        this.nome = nome;
        this.numeroPatas = 4;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    public abstract void emitirSom();
}
