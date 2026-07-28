/*  A agregação ocorre entre Autor e Livro, pois o autor pode existir independentemente do livro.
    Também ocorre entre Emprestimo e Funcionario, já que o funcionário existe mesmo sem um empréstimo.
    A composição ocorre entre Livro e Exemplar, pois os exemplares são criados pelo livro e fazem 
    parte dele, dependendo da sua existência.
*/
    
    public class Main {
	public static void main(String args[]) {

		Autor a1 = new Autor("Fulano de tal");
		Autor a2 = new Autor("Cicrano de tal");
		Livro l1 = new Livro("ERA", a1, 2000, "1234e");
		Livro l2 = new Livro("UMA VEZ", a2, 2015, "543o");
		Funcionario f1 = new Funcionario("Marcos", "mni32y");
        Exemplar ex = new Exemplar(1);
        Emprestimo emp = new Emprestimo(ex,f1);
        
        l1.exibirInfo();
        l2.exibirInfo();
        emp.realizarEmprestimo();
        emp.realizarEmprestimo();
        emp.exibirInfo();
        emp.realizarDevolucao();
    
	}
}