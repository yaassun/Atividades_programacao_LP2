public class Main{
    public static void main(String []args){
        
        Funcionario f1 = new Horista("Joao", "444.444.444-44", 200, 20);
        Funcionario f2 = new Mensalista("Mary", "111.111.111-11", 2500.6);
        Funcionario f3 = new Horista("Giovanna", "222.222.222-22", 240, 16.5);
        Funcionario f4 = new Mensalista("Icaro", "333.333.333-33", 12000);

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();
        f4.exibirDados();

    }
}