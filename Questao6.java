import java.util.Scanner;

public class Questao6 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira sua primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Insira sua segunda nota: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Insira nota do seu trabalho: ");
        float trabalho = teclado.nextFloat();

        float media = (nota1 + nota2 + trabalho) / 3;

        if(media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        teclado.close();
    }
}