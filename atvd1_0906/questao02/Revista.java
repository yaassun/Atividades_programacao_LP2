public class Revista extends ItemBiblioteca {
    protected String edicao;
    
    public Revista (String titulo, int codigo, String edicao){
        super(titulo, codigo);
        this.edicao = edicao;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("\n============== Revista nº" + codigo + " ==============");
        System.out.println("Titulo: " + titulo + " Codigo: " + codigo + " Edição: " + edicao);
    }
}