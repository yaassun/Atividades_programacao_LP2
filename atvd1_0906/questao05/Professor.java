public class Professor extends Pessoa {
    protected String disciplina;

    public Professor (String nome, String cpf, String disciplina){
        super(nome,cpf);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do professor: " + nome + " | CPF: " + cpf + 
        " | Disciplina: " + disciplina);
    }

}