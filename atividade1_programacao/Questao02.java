import java.util.Scanner;

public class Questao2 {
    public static void main(String args[]){
        float gasolina, preco, distancia, litros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a distancia que será percorrida: ");
        distancia = teclado.nextFloat();
        System.out.println("Insira o preço do litro da gasolina: ");
        gasolina = teclado.nextFloat();
        
        litros = distancia / 12;
        preco = litros * gasolina;

        System.out.println("Será preciso pôr " + litros + " litros de gasolina no carro e custará R$" + preco + "0.");

        teclado.close();
    }
    
}
