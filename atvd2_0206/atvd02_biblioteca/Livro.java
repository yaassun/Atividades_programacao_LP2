public class Livro {
    private String titulo;
    private Autor autor;
    private int ano;
    private String isbn;
    private Exemplar ex1,ex2;

    public Livro(String titulo, Autor autor, int ano, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        
        Exemplar ex1 = new Exemplar(1);
        Exemplar ex2 = new Exemplar(2);
    }

    public void exibirInfo(){
        System.out.println("Livro: " + titulo + " | Autor: " + autor.getNome() + " | Ano: " + ano + 
        " | ISBN: " + isbn);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }


}