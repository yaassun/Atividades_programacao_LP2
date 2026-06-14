public class Aluno extends Pessoa {
    protected String matricula;

    public Aluno (String nome, String cpf, String matricula){
        super(nome,cpf);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do aluno: " + nome + " | CPF: " + cpf + 
        " | Matricula: " + matricula);
    }

}