public class Horista extends Funcionario {
    protected double horas;
    protected double valorH;
    
    public Horista(String nome, String cpf, double horas, double valorH){
        super(nome,cpf);
        this.horas = horas;
        this.valorH = valorH;
    }
    
    @Override
    public double calcularPagamento(){
        return valorH * horas;
    }
}