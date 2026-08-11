import java.util.Scanner;

public class CalculadoraSeguro {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite a idade do condutor: ");
            int idade = teclado.nextInt();

            if (idade < 18) {
                throw new IdadeInvalidaException("Idade do condutor inválida!");
            }

            System.out.print("Digite o valor do veículo: ");
            double valorCarro = teclado.nextDouble();

            if (valorCarro <= 0) {
                throw new IllegalArgumentException("O valor do veículo deve ser maior que zero!");
            }

            double percSeguro = 0.05;

            if (idade < 25) {
                percSeguro += 0.02;
            }

            double valorSeguro = valorCarro * percSeguro;

            System.out.printf("Valor do seguro: R$ %.2f%n", valorSeguro);

        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Processo encerrado");
            
            teclado.close();
        }
    }
}