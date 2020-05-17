package aulaorientacaobjeto.ExercicioPessoa;


public class Pessoa {
    String nome;
    int idade;
    String cpf;
    
    //metodos
    
    
    public Pessoa(){
    }
    
    public Pessoa(String nome, int idade, String CPF){
        this.nome = nome;
        this.idade = idade;
        this.cpf = CPF;
    }
    public void construtor(){
        Pessoa pessoa = new Pessoa("Lucas",19,"3124324");
    }
    
    public void construtor_padrao(String nome, int idade, String cpf){
        this.nome = "Joao";
        this.idade = 14;
        this.cpf = "4131342";
    }
    
    public void novaPessoa(String nNome,int nIdade, String nCPF){
        this.nome = nNome;
        this.idade = nIdade;
        this.cpf = nCPF;
    }
    
}
