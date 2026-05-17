import java.util.Scanner;

public class Questao9 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da hora/aula: ");
        float valorHora = teclado.nextFloat();
        System.out.println("Informe a sua quantidade de horas trabalhadas no mês: ");
        float horaMes = teclado.nextFloat();
        System.out.println("Informe o percentual de desconto do INSS: ");
        float percentual = teclado.nextFloat();

        float salarioBruto = valorHora * horaMes;
        float desconto = salarioBruto * (percentual/100);
        float salarioLiquido = salarioBruto - desconto;

        System.out.println("O salario líquido é: R$" + salarioLiquido + "0.");

        teclado.close();
    }
}
