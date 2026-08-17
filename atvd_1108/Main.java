public class Main{
    public static void main(String args[]){

        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro( "123","Machado de Assis","Principis","Dom Casmurro");
        Livro l2 = new Livro("456","Jorge Amado","Companhia das Letras","Capitães da Areia");
        Livro l3 = new Livro("123","Outro Autor","Outra Editora","Outro Livro");

        biblioteca.adicionar(l1);
        biblioteca.adicionar(l2);

        System.out.println("Livros cadastrados:");
        biblioteca.imprimir();

        System.out.println("Livro 1 existe? " + biblioteca.existe(l1));
        System.out.println("Livro 3 existe? " + biblioteca.existe(l3));

        System.out.println("\nLivro encontrado:");
        Livro encontrado = biblioteca.obterLivro(l3);

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Livro não encontrado.");
        }

        biblioteca.remover(l1);

        System.out.println("\nDepois da remoção:");
        biblioteca.imprimir();

        System.out.println("Lista está vazia? " + biblioteca.estaVazia());
    }
}
