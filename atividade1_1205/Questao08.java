import java.util.Scanner;

public class Questao8 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do raio: ");
        float raio = teclado.nextFloat();

        double area = 3.14 * (raio * raio);

        System.out.println("A área da circunferência calculada é: " + area);

        teclado.close();
    }
}
