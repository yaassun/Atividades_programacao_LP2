public abstract class Funcionario{
    protected String matricula;
    protected String nome;
    protected double salario;
    
    public Funcionario(String matricula, String nome, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract double calcularSalario();
    
    public void exibirDados(){
        System.out.printf("Matrícula: %s | Nome: %s | Salário: R$ %.2f%n",
                matricula, nome, calcularSalario());
    }
}