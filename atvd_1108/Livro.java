public class Livro {
    private String isbn;
    private String autor;
    private String editora;
    private String titulo;

    public Livro(String isbn, String autor, String editora, String titulo){
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getAutor(){
        return autor;
    }

    public String getEditora(){
        return editora;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Livro outro = (Livro) obj;

        return isbn.equals(outro.isbn);
    }

    @Override
    public int hashCode(){
        return isbn.hashCode();
    }

    @Override
    public String toString(){
        return "ISBN: " + isbn +
               "\nAutor: " + autor +
               "\nEditora: " + editora +
               "\nTítulo: " + titulo;
    }
}