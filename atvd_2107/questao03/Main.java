public class Main {
	public static void main(String[] args) {
        
        Funcionario f1 = new Professor("P001", "Ana", 3000, 10, 50);
        Funcionario f2 = new Tecnico("T001", "Bruno", 2500, 20);
        Funcionario f3 = new Coordenador("C001", "Carla", 4000, 800);

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();

	}
}
