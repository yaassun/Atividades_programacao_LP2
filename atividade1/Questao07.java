import java.util.Scanner;

public class Questao7 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu peso (kg): ");
        float peso = teclado.nextFloat();
        System.out.println("Informe sua altura (m): ");
        float altura = teclado.nextFloat();

        float imc = peso / (altura * altura);

        if(imc > 30){
            System.out.println("Você está obeso.");
        }

        teclado.close();
    }
}
