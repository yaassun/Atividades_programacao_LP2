public class Estagiario extends Funcionario {

    public Estagiario(String nome, String cpf, String telefone, double salario, String matricula){
        super(nome,cpf,telefone,salario,matricula);
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("----------------------------------------------------------\n");
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Telefone: " + telefone
                            + " | Salario: " + salario + " | Matricula: " + matricula);
    }
    
    public void gerarRelatorio(){
        System.out.println("Relatório do Estagiario...");
    }
}