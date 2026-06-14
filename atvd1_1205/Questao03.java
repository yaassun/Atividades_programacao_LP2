import java.util.Scanner;

public class Questao3 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = teclado.nextInt();
        
        if (idade >= 18){
            System.out.println("Parabéns! Você já pode tirar a habilitação.");
        } else {
            System.out.println("Você não pode tirar a habilitação.");
        }

        teclado.close();
    }
}