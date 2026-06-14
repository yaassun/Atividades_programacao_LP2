public class Onibus extends Transporte {
    protected int linha;
    
    public Onibus (int capacidade, int linha){
        super(capacidade);
        this.linha = linha;
    }
    
    @Override
    public void mostrarDetalhes(){
        System.out.println("Capacidade de passageiros do ônibus: " + capacidade 
        + " | Linha: " + linha);
    }
}