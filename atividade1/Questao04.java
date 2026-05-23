import java.util.Scanner;

public class Questao4 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        float temperatura = teclado.nextFloat();

        if(temperatura > 37){
            System.out.println("O paciente está com febre.");
        } else {
            System.out.println("A temperatura está normal.");
        }

        teclado.close();
    }
}
