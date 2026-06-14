public class Mensalista extends Funcionario {
    protected double salarioFixo;
    
    public Mensalista(String nome, String cpf, double salarioFixo){
        super(nome,cpf);
        this.salarioFixo = salarioFixo;
    }
    
    @Override
    public double calcularPagamento(){
        return salarioFixo;
    }
}