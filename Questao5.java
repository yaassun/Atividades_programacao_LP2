import java.util.Scanner;

public class Questao5 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int n1 = teclado.nextInt();
        System.out.println("Informe outro numero: ");
        int n2 = teclado.nextInt();

        if(n1 > n2){
            System.out.println("O maior é " + n1);
        } else if(n2 > n1){
            System.out.println("O maior é " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
        
        teclado.close();
    }
}
