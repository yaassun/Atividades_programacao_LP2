/*
A herança é vantajosa pois reutiliza o código já existente, evita a duplicaçao de atributos
e metodos, isso acaba auxiliando bastante na praticidade e eficiencia na hora de programar.
*/

public class Main {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Maria", 25, "123456789", 759999999, "maria@email.com", "P001");
		
        Aluno a1 = new Aluno("Icaro", 20, "111111111", 75888888, "icaro@email.com", "A001", 
                             "Sistemas de Informacao", 6);
                             
        Professor prof1 = new Professor("Eduardo", 40, "222222222",757777777, "edu@ifba.edu.br",
                                        "PR001", "POO", 18000);
	
	    p1.exibirInfo();
	    a1.exibirInfo();
	    prof1.exibirInfo();
	    prof1.darAula();
	    a1.assistirAula();
	}
}
