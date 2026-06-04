public class Funcionario {

    public String nome;
    public String cpf;
    public String rg;
    private int matricula;
    private double salario;
    public String dataCont;
    private double salarioBase;
    private double horasTrab;
    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, double horasTrab){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrab = horasTrab;
        this.dataCont = "04/06/2026";
        this.matricula = ++geraMatricula;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calculaSalario(){
        Calculo c= new Calculo();
        c.calculaSalario(this.salarioBase, this.horasTrab);
        this.salario = c.getTotalSalario();
    }
    
    public void imprimeDados(){
        System.out.println("----------Funcionario nº " + matricula + "----------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Matricula: " + matricula);
        System.out.println("Data da contratação: " + dataCont);
        System.out.println("Salário: " + salario + "\n");
    }
    
}
