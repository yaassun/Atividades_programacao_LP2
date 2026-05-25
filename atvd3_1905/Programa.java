public class Programa {
    public static void main(String args[]){
        Produto p1 = new Produto("Mouse",100,35);
        Produto p2 = new Produto("Teclado",350,50);
        Produto p3 = new Produto("Notebook",4000,12);

        System.out.println("Nome: " +  p1.getNome());
        System.out.println("Preço: " +  p1.getPreco());
        System.out.println("Quantidade em estoque: " +  p1.getQtdeEstoque());
        System.out.println("Valor total do estoque de " + p1.getNome() + "(s): " +  p1.calcularValorEstoque());

        System.out.println("Nome: " +  p2.getNome());
        System.out.println("Preço: " +  p2.getPreco());
        System.out.println("Quantidade em estoque: " +  p2.getQtdeEstoque());
        System.out.println("Valor total do estoque de " + p2.getNome() + "(s): " +  p2.calcularValorEstoque());

        System.out.println("Nome: " +  p3.getNome());
        System.out.println("Preço: " +  p3.getPreco());
        System.out.println("Quantidade em estoque: " +  p3.getQtdeEstoque());
        System.out.println("Valor total do estoque de " + p3.getNome() + "(s): " +  p3.calcularValorEstoque());

        System.out.println("Total de produtos criados: " +  Produto.getContProdutos() + "\n");

        p1.setPreco(-100);      //testando dados invalidos
        p3.setQtdeEstoque(-5);

        System.out.println("Após testar dados invalidos: ");
        System.out.println("Preço do Mouse: " +  p1.getPreco());
        System.out.println("Quantidade em estoque do Notebook: " +  p3.getQtdeEstoque());

        System.out.println("Total de produtos criados: " + Produto.getContProdutos());

    }

    /* Por que utilizamos atributos private? 
    R: Usamos private para proteger os dados e impedir alterações diretas indevidas.

     * O que aconteceria se os atributos fossem public? 
    R: Se fossem public, qualquer classe poderia mudar valores sem validação, tipo preço negativo.

     * Qual a função do construtor? 
    R: O construtor inicializa o objeto quando ele é criado.

     * Como o encapsulamento ajuda na manutenção do sistema?Usamos private para proteger os dados e impedir alterações diretas indevidas.
    R: O encapsulamento ajuda porque centraliza as regras nos setters, facilitando manutenção e evitando dados inválidos. */
}
