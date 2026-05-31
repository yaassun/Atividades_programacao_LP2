public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;
    private int qtdeDisp;

    public Livro(String titulo, String autor, int ano, String isbn, int qtdeDisp){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        this.qtdeDisp = qtdeDisp;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestarLivro(){
        if(qtdeDisp > 0){
            qtdeDisp--;
            System.out.println("Livro \"" + titulo + "\" emprestado!");
        } else{
            System.out.println("Livro \"" + titulo + "\" não disponivel no estoque.");
        }
    }

    public void devolverLivro(){
        qtdeDisp++;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso!");
    }

    public void exibirInfo(){
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Ano: " + ano + 
        " | ISBN: " + isbn + " | Estoque: " + qtdeDisp);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
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

    public int getQtdeDisp(){
        return qtdeDisp;
    }

    public void setQtdeDisp(int qtdeDisp){
        if(qtdeDisp >= 0){
            this.qtdeDisp = qtdeDisp;
        }
    }

}