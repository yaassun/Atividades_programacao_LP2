public class Main {
	public static void main(String[] args) {

        Pessoa p = new Pessoa("Yasmin", "999.999.999-99");
        Pessoa a1 = new Aluno("Sasha", "111.111.111-11", "20232bsif2");
        Pessoa a2 = new Aluno("Mary", "122.111.111-11", "20232bsi1");
        Pessoa a3 = new Aluno("Marcelo", "133.111.111-11", "20232bsif3");
        Pessoa p1 = new Professor("Erin", "144.111.111-11", "Ingles");
        Pessoa p2 = new Professor("Cesar", "155.111.111-11", "Matematica");
        Pessoa p3 = new Professor("Liz", "166.111.111-11", "Portugues");

        p.exibirDados();
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();

	}
} 