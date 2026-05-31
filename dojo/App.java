public class App {
    public static void main(String args[]){
        Livro l1 = new Livro("Harrry potter", "JK", 2000, "1234a", 10);
        Livro l2 = new Livro("Java", "Sun", 2010, "5678e", 25);
        Livro l3 = new Livro("Hamlet", "Shakespeare", 1600, "13", 5);

        Usuario usuario = new Usuario("Serginho", "BSI", "20232b");

        Biblioteca b1 = new Biblioteca("Biblioteca Municipal", 110);
        Biblioteca b2 = new Biblioteca("Biblioteca do IFBA", 40);


        usuario.exibirUsuario();
        l1.exibirInfo();
        l2.exibirInfo();
        l3.exibirInfo();
        l3.emprestarLivro();
        l3.exibirInfo();
        l3.devolverLivro();
        l3.exibirInfo();
        Biblioteca.exibirTotalLivros();
    }
}
