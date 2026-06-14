import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        int horas;
        float salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira sua quantidade de horas trabalhadas no mês: ");
        horas = teclado.nextInt();
        
        salario = horas * 20;

        System.out.println("O seu salario é: R$ " + salario);

        teclado.close();
    }
}