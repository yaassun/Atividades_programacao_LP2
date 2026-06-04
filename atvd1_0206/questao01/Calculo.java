public class Calculo {

    private double totalSalario;

    public void calculaSalario(double salarioBase, double horasTrab){
        totalSalario = salarioBase * horasTrab;
    }
    
    public double getTotalSalario() {
        return totalSalario;
    }
}