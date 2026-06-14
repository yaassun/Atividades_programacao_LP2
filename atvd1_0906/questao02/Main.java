public class Main {
	public static void main(String[] args) {
        
        ItemBiblioteca l1 = new Livro("POO", 1, "Oliveira", 200);
        ItemBiblioteca l2 = new Livro("Java", 2, "Silva", 500);
        ItemBiblioteca l3 = new Livro("Redes de computadores", 3, "Souza", 420);
    
        ItemBiblioteca r1 = new Revista("Caras", 4, "especial");
        ItemBiblioteca r2 = new Revista("Veja", 5, "nº1");
        ItemBiblioteca r3 = new Revista("Vogue", 6, "nº4");
    
        ItemBiblioteca d1 = new DVD("PTV", 7, 3);
        ItemBiblioteca d2 = new DVD("Wave to earth", 8, 4);
        ItemBiblioteca d3 = new DVD("ET", 9, 3.5);
        
        l1.exibirInfo();
        l2.exibirInfo();
        l3.exibirInfo();
        r1.exibirInfo();
        r2.exibirInfo();
        r3.exibirInfo();
        d1.exibirInfo();
        d2.exibirInfo();
        d3.exibirInfo();
        
	}
}
