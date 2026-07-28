public class Professor extends Pessoa {
    public Professor(String nome, String matricula, String senhaCad) {
        super(nome, matricula, senhaCad);
    }

    public void ministrarDisciplina(String disciplina) {
        System.out.println(nome + " ministra a disciplina de " + disciplina);
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor: " + nome + " | Matrícula: " + matricula);
    }
}
