public class Aluno extends Pessoa {
    public Aluno(String nome, String matricula, String senhaCad) {
        super(nome, matricula, senhaCad);
    }

    public void realizarMatricula() {
        System.out.println(nome + " realizou matrícula.");
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
    }
}
