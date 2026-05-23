import java.util.Scanner;

public class Questao10 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        float n1 = teclado.nextFloat();
        System.out.println("Informe outro número: ");
        float n2 = teclado.nextFloat();

        float soma = n1 + n2;

        if(soma > 10){
            System.out.println("O resultado é: " + soma);
        }

        teclado.close();
    }
}
