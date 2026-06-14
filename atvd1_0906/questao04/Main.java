 public class Main {
	public static void main(String[] args) {

        Transporte b1 = new Bicicleta(1,false);
        Transporte b2 = new Bicicleta(2,true);
        Transporte c1 = new Carro(7,20);
        Transporte c2 = new Carro(5,15);
        Transporte o1 = new Onibus(80,3);
        Transporte o2 = new Onibus(60,88);
        Transporte t = new Transporte(50);


        b1.mostrarDetalhes();
        b2.mostrarDetalhes();
        c1.mostrarDetalhes();
        c2.mostrarDetalhes();
        o1.mostrarDetalhes();
        o2.mostrarDetalhes();
        t.mostrarDetalhes();

	}

}