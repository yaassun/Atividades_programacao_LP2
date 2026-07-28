public class Tecnico extends Funcionario{
    private double percentInsalub;
    
    public Tecnico(String matricula, String nome, double salario, 
                   double percentInsalub){
        super(matricula, nome, salario);
        this.percentInsalub = percentInsalub;
    }
    
    @Override
    public double calcularSalario() {
        return salario + (salario * percentInsalub / 100);
    }
}