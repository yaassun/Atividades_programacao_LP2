public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected int telefone;
    protected String email;
    protected String matricula;
    
    public Pessoa(String nome, int idade, String cpf, int telefone,
    String email, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }
    
    public void exibirInfo(){
        System.out.println("---------------------------------------------\n");
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | CPF: " + cpf + 
        " | Telefone: " + telefone + " | Email: " + email + " | Matricula: " + matricula);
    }
    
}
