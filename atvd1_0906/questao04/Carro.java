public class Carro extends Transporte {
    protected double combustivel;
    
    public Carro (int capacidade, double combustivel){
        super(capacidade);
        this.combustivel = combustivel;
    }
    
    @Override
    public void mostrarDetalhes(){
        System.out.println("Capacidade de passageiros do carro: " + capacidade 
        + " | Combustivel: " + combustivel + "L");
    }
}