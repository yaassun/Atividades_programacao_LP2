public class Coordenador extends Funcionario{
    private double gratificacao;
    
    public Coordenador(String matricula, String nome, double salario, 
                       double gratificacao){
        super(matricula, nome, salario);
        this.gratificacao = gratificacao;
    }
    
    @Override
    public double calcularSalario() {
        return salario + gratificacao;
    }
}