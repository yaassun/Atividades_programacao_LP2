import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    
    private List<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionar(Livro livro){
        livros.add(livro);
    }

    public void remover(Livro livro){
        livros.remove(livro);
    }

    public void imprimir(){
        for (Livro livro : livros){
            System.out.println(livro);
            System.out.println("--------------------");
        }
    }

    public boolean existe(Livro livro){
        return livros.contains(livro);
    }
    
    public Livro obterLivro(Livro livro){
        for (Livro l : livros){
            if (l.equals(livro)){
                return l;
            }
        }
        return null;
    }

    public boolean estaVazia(){
        return livros.isEmpty();
    }
    
}