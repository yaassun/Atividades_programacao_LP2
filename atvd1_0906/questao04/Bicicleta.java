public class Bicicleta extends Transporte {
    protected boolean temMarchas;
    
    public Bicicleta (int capacidade, boolean temMarchas){
        super(capacidade);
        this.temMarchas = temMarchas;
    }
    
    @Override
    public void mostrarDetalhes(){
        System.out.println("Capacidade de passageiros da bicicleta: " + capacidade);
        if(temMarchas){
            System.out.println("A Bicicleta possui marcha.");
        } else {
            System.out.println("A Bicicleta não possui marcha.");
        }
    }
}