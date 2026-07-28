public class Aluno extends Pessoa {
    protected String curso;
    protected int semestre;

    public Aluno(String nome, int idade, String cpf, int telefone,
    String email, String matricula, String curso, int semestre){
        super(nome,idade,cpf,telefone,email,matricula);
        this.curso = curso;
        this.semestre = semestre;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("---------------------------------------------\n");
        System.out.println("Nome do aluno: " + nome + " | Idade: " + idade + " | CPF: " + cpf + 
        " | Telefone: " + telefone + " | Email: " + email + " | Matricula: " + matricula + 
        " | Curso: " + curso + " | Semestre: " + semestre + "º");
    }
    
    public void assistirAula(){
        System.out.println("\nAluno(a) "+ nome + " vendo aula.");
    }
}