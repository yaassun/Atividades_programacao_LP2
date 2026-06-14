public class Livro extends ItemBiblioteca {
    protected String autor;
    protected int numPags;
    
    public Livro (String titulo, int codigo, String autor, int numPags){
        super(titulo,codigo);
        this.autor = autor;
        this.numPags = numPags;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("\n============== Livro nº" + codigo + " ==============");
        System.out.println("Titulo: " + titulo + " Codigo: " + codigo + " Autor: "
        + autor + " Numero de paginas: " + numPags);
    }
}