public class Professor extends Pessoa {
    protected String disciplina;
    protected double salario;
    
    public Professor(String nome, int idade, String cpf, int telefone,
    String email, String matricula, String disciplina, double salario){
        super(nome,idade,cpf,telefone,email,matricula);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("---------------------------------------------\n");
        System.out.println("Nome do aluno: " + nome + " | Idade: " + idade + " | CPF: " + cpf + 
        " | Telefone: " + telefone + " | Email: " + email + " | Matricula: " + matricula + 
        " | Disciplina: " + disciplina + " | Salario: R$" + salario + "0");
    }
    
    public void darAula(){
        System.out.println("\nProfessor(a) "+ nome + " dando aula de " + disciplina);
    }
}