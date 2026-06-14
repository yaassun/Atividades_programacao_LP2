public class DVD extends ItemBiblioteca {
    protected double duracao;
    
    public DVD (String titulo, int codigo, double duracao){
        super(titulo, codigo);
        this.duracao = duracao;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("\n============== DVD nº" + codigo + " ==============");
        System.out.println("Titulo: " + titulo + " Codigo: " + codigo + " Duração: " + duracao + "h(s)");
    }
}