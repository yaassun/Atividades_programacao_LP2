public class Funcionario {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected double salario;
    protected String matricula;
    
    public Funcionario(String nome, String cpf, String telefone, double salario, String matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.matricula = matricula;
    }
    
    public void exibirInfo(){
        System.out.println("----------------------------------------------------------\n");
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Telefone: " + telefone
                            + " | Salario: " + salario + " | Matricula: " + matricula);
    }
    
    public void gerarRelatorio(){
        System.out.println("\nRelatório do Funcionário...");
    }
    
}
