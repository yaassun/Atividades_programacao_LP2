public class Coordenador extends Pessoa {
    public Coordenador(String nome, String matricula, String senhaCad) {
        super(nome, matricula, senhaCad);
    }

    public void aprovarPlanoDeEnsino() {
        System.out.println(nome + " aprovou o plano de ensino.");
    }

    @Override
    public void exibirDados() {
        System.out.println("Coordenador: " + nome + " | Matrícula: " + matricula);
    }
}