public class Main {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Maria", "123456789", "759999999", 3000, "P001");
		Funcionario g1 = new Gerente("Monica", "227654789", "7599765999", 4500, "y001");
		Funcionario a1 = new Analista("Luzia", "763980089", "757654999", 2000, "o001");
		Funcionario e1 = new Estagiario("Matilda", "54636789", "76999789769", 6000, "e001");
	
	    f1.exibirInfo();
	    g1.exibirInfo();
	    a1.exibirInfo();
	    e1.exibirInfo();
	    f1.gerarRelatorio();
	    g1.gerarRelatorio();
	    a1.gerarRelatorio();
	    e1.gerarRelatorio();
	}
}
