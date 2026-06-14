public class Main {
	public static void main(String[] args) {

        Animal c1 = new Cachorro("Dog", 4, "Pastor Alemao");
        Animal c2 = new Cachorro("Bob", 24, "Vira-lata caramelo");

        Animal g1 = new Gato("Mia", 32, "Preta");
        Animal g2 = new Gato("Dante", 20, "Rajada");

        Animal a1 = new Ave("Lola", 15, "Papagaio");
        Animal a2 = new Ave("Blue", 24, "Arara-azul");

        c1.exibirInfo();
        c2.emitirSom();
        g1.exibirInfo();
        g2.emitirSom();
        a1.exibirInfo();
        a2.emitirSom();
        
	}
}