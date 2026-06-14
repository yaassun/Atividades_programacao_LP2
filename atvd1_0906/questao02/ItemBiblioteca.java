public class ItemBiblioteca {
    protected String titulo;
    protected int codigo;
    
    public ItemBiblioteca (String titulo, int codigo){
        this.titulo = titulo;
        this.codigo = codigo;
    }
    
    public void exibirInfo(){
        System.out.println("\n============== Item nº" + codigo + " ==============");
        System.out.println("Titulo: " + titulo + " Codigo: " + codigo);
    }
  
}