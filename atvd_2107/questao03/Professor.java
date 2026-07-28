public class Professor extends Funcionario{
    private int horaAula;
    private double valorHora;
    
    public Professor(String matricula, String nome, double salario, 
                    int horaAula, double valorHora){
        super(matricula, nome, salario);
        this.horaAula = horaAula;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario() {
        return salario + (horaAula * valorHora);
    }
}