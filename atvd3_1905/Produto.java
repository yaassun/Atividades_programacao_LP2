public class Produto{
    private String nome;
    private double preco;
    private int qtdeEstoque;
    private static int contProdutos = 0;

    public Produto(String nome, double preco, int qtdeEstoque){
        this.nome = nome;

        if (preco >= 0){
            this.preco = preco;
        }

        if(qtdeEstoque >= 0){
            this.qtdeEstoque = qtdeEstoque;
        }

        contProdutos++;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco;
        }
    }
    public int getQtdeEstoque(){
        return this.qtdeEstoque;
    }
    public void setQtdeEstoque(int qtdeEstoque){
        if(qtdeEstoque >= 0){
            this.qtdeEstoque = qtdeEstoque;
        }
    }
    public static int getContProdutos(){
        return contProdutos;
    }

    public double calcularValorEstoque(){
        return preco * qtdeEstoque;
    }
}

