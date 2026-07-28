public class Main {
	public static void main(String[] args) {

		Aluno a = new Aluno("Lucas", "A001", "1234");
		Professor p = new Professor("Ana Silva", "PR001", "ana67");
		Coordenador c = new Coordenador("Carlos Bastos", "CD001", "bs987");

		a.exibirDados();
		a.realizarMatricula();
		System.out.println("Aluno autenticado: " + a.autenticar("1234"));

		p.exibirDados();
		p.ministrarDisciplina("LP2");
		System.out.println("Professor autenticado: " + p.autenticar("ana67"));

		c.exibirDados();
		c.aprovarPlanoDeEnsino();
		System.out.println("Coordenador autenticado: " + c.autenticar("bs988"));
		System.out.println("Coordenador autenticado: " + c.autenticar("bs987"));
	}
}