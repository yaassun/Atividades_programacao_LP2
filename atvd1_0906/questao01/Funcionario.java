public class Funcionario {
    protected String nome;
    protected String cpf;
    
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public double calcularPagamento(){
        return 0;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + nome + " CPF: " + cpf + " Salário: R$" +
        calcularPagamento());
    }
}