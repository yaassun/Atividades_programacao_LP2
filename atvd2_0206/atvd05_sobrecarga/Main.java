public class Main {
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println(c.somar(10, 5));
        System.out.println(c.somar(1.5, 2.5));
        System.out.println(c.somar(1.0, 2.0, 3.0));
        
        System.out.println(c.subtrair(20, 5));
        System.out.println(c.multiplicar(2, 3, 4));
        System.out.println(c.dividir(100, 2));
	
	}
}
