public class Biblioteca {
    private String nomeBiblioteca;
    private int qtdeLivros;
    private static int contLivros = 0;

    public Biblioteca(String nomeBiblioteca, int qtdeLivros){
        this.nomeBiblioteca = nomeBiblioteca;
        this.qtdeLivros = qtdeLivros;
        contLivros += qtdeLivros;
    }

    public static void exibirTotalLivros(){
        System.out.println("Total de livros cadastrados: " + contLivros);
    }

    public static int getContLivros(){
        return contLivros;
    }

}